package de.nm.ltxml.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.xerces.impl.dv.util.Base64;

import de.nm.ltxml.core.Abgeordneter;
import de.nm.ltxml.core.BayLandtag;
import de.nm.ltxml.core.KreisAbg;
import de.nm.ltxml.core.OrdenAbg;
import de.nm.ltxml.core.ParFktAbg;
import de.nm.ltxml.core.ParteiAbg;
import de.nm.ltxml.core.Wahlperiode;
import de.nm.ltxml.gui.MainPageController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.converter.DefaultStringConverter;

public class TreeViewHelper
{

	private final String abgSeite;
	private ArrayListContainerAlphabet con = null;
	private ArrayListContainerAlphabet conVorname = null;

	private TreeItem<String> defaultRoot;
	private final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	private final BayLandtag landtag;
	private Image nodeImgAbgIcon = null;
	private Image nodeIMgIcon = null;
	private Image nodeImgSuche = null;
	private final Properties props;
	private final TreeView<String> treeView;
	private TreeItem<String> vornameRoot;
	private TreeItem<String> wahlperiodeRoot;
	private final WebView webView;

	public TreeViewHelper(final TreeView<String> newTreeView, final WebView newWebView, final BayLandtag newLandtag)
	{
		super();
		treeView = newTreeView;
		webView = newWebView;
		landtag = newLandtag;

		props = new Properties();
		final InputStream stream = MainPageController.class.getClassLoader().getResourceAsStream("template.properties");

		try
		{
			props.load(stream);
		} catch (final IOException e)
		{

			e.printStackTrace();
		}

		abgSeite = props.getProperty("htmlCode");

		nodeIMgIcon = new Image(getClass().getResourceAsStream("wappenlandtag.jpg"));
		nodeImgAbgIcon = new Image(getClass().getResourceAsStream("man.png"));
		nodeImgSuche = new Image(getClass().getResourceAsStream("questionmark.jpg"));

	}

	public ArrayListContainerAlphabet getCon()
	{
		return con;
	}

	public ArrayListContainerAlphabet getConVorname()
	{
		return conVorname;
	}

	public TreeItem<String> getDefaultRoot()
	{
		return defaultRoot;
	}

	public TreeItem<String> getVornameRoot()
	{
		return vornameRoot;
	}

	public TreeItem<String> getWahlperiodeRoot()
	{
		return wahlperiodeRoot;
	}

	public void setCon(final ArrayListContainerAlphabet con)
	{
		this.con = con;
	}

	public void setConVorname(final ArrayListContainerAlphabet con)
	{
		conVorname = con;
	}

	public void setDefaultRoot(final TreeItem<String> defaultRoot)
	{
		this.defaultRoot = defaultRoot;
	}

	public void setUpTree()
	{
		con = DataHelper.getAllAbg(landtag);
		treeView.setEditable(true);
		treeView.setCellFactory(p -> new TextFieldTreeCell<>(new DefaultStringConverter()));

		final TreeItem<String> root = new TreeItem<>("Nach Nachnamen", new ImageView(nodeIMgIcon));

		root.setExpanded(true);

		final List<String> labels = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

		for (final String name : labels)
		{
			final TreeItem<String> mainItem = new TreeItem<>(name);
			mainItem.setValue(name);
			mainItem.setExpanded(false);

			for (final Abgeordneter abg : con.getHashMap().get(name))
			{
				final TreeItem<String> item = new TreeItem<>(abg.getName() + " " + abg.getVorname(),
						new ImageView(nodeImgAbgIcon));
				item.setValue(abg.getName() + " " + abg.getVorname());

				mainItem.getChildren().add(item);
			}
			root.getChildren().add(mainItem);
		}

		treeView.setRoot(root);
		treeView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<TreeItem<String>>) (observable,

				oldValue, newValue) -> setWebViewContent(observable, newValue));

		treeView.setEditable(false);
		defaultRoot = root;

	}

	public void setUpTreeSuche(final TextField textfield)
	{
		if (textfield.getText() == null || textfield.getText().length() == 0 || textfield.getText().trim().equals("")
				|| !textfield.getText().matches("^[a-zA-Z\\s]+"))
		{
			return;
		}

		treeView.setEditable(true);
		treeView.setCellFactory(p -> new TextFieldTreeCell<>(new DefaultStringConverter()));

		final TreeItem<String> root = new TreeItem<>("Suchergebnisse", new ImageView(nodeImgSuche));
		root.setValue("Suchergebnisse");
		root.setExpanded(true);

		final HashMap<String, Abgeordneter> suchMap = con.getHashNachname();
		final ArrayList<String> keys = con.getHashKeysNachname();

		for (final String key : keys)
		{

			if (textfield.getText().toUpperCase().equals(key) || key.contains(textfield.getText().toUpperCase()))
			{
				final Abgeordneter abg = suchMap.get(key);
				final TreeItem<String> item = new TreeItem<>(abg.getName() + " " + abg.getVorname(),
						new ImageView(nodeImgAbgIcon));
				item.setValue(abg.getName() + " " + abg.getVorname());

				root.getChildren().add(item);
			}
		}

		treeView.setRoot(root);
		treeView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<TreeItem<String>>) (observable,
				oldValue, newValue) -> setWebViewContent(observable, newValue));
		treeView.setEditable(false);
	}

	public void setUpTreeVorname()
	{
		treeView.setEditable(true);
		treeView.setCellFactory(p -> new TextFieldTreeCell<>(new DefaultStringConverter()));

		final TreeItem<String> root = new TreeItem<>("Nach Vornamen", new ImageView(nodeIMgIcon));

		root.setExpanded(true);

		final List<String> labels = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

		for (final String name : labels)
		{
			final TreeItem<String> mainItem = new TreeItem<>(name);
			mainItem.setValue(name);
			mainItem.setExpanded(false);

			for (final Abgeordneter abg : conVorname.getHashMap().get(name))
			{
				final TreeItem<String> item = new TreeItem<>(abg.getVorname() + " " + abg.getName(),
						new ImageView(nodeImgAbgIcon));
				item.setValue(abg.getVorname() + " " + abg.getName());

				mainItem.getChildren().add(item);
			}
			root.getChildren().add(mainItem);
		}
		vornameRoot = root;
		treeView.setRoot(root);
		treeView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<TreeItem<String>>) (observable,
				oldValue, newValue) -> setWebViewContent(observable, newValue));
		treeView.setEditable(false);

	}

	public void setUpTreeWhalperiode()
	{
		treeView.setEditable(true);
		treeView.setCellFactory(p -> new TextFieldTreeCell<>(new DefaultStringConverter()));

		final TreeItem<String> root = new TreeItem<>("Nach Wahlperioden", new ImageView(nodeIMgIcon));
		root.setValue("Nach Wahlperioden");
		root.setExpanded(true);

		final List<Wahlperiode> wahlen = landtag.getWahlperiode();
		final DateFormat format = new SimpleDateFormat("yyyy");
		int i = 1;
		for (final Wahlperiode wahl : wahlen)
		{

			final String name = i + ". Wahlperiode: " + format.format(wahl.getVon()) + "-"
					+ format.format(wahl.getBis());
			final TreeItem<String> mainItem = new TreeItem<>(name);
			mainItem.setValue(name);
			mainItem.setExpanded(false);

			i++;

			for (final Abgeordneter abg : landtag.getAbgeordnete())
			{

				for (final Wahlperiode wahlperiode : abg.getWahlperioden())
				{
					if (wahlperiode.getBis() != null && wahlperiode.getVon() != null)
					{
						if (wahlperiode.getVon().before(wahl.getVon()) && wahl.getVon().before(wahlperiode.getBis())
								|| wahlperiode.getVon().equals(wahl.getVon()))
						{
							final TreeItem<String> item = new TreeItem<>(abg.getName() + " " + abg.getVorname(),
									new ImageView(nodeImgAbgIcon));

							mainItem.getChildren().add(item);
							break;

						}

						if (wahlperiode.getVon().after(wahl.getVon()) && wahlperiode.getBis().before(wahl.getBis())
								|| wahl.getBis().equals(wahlperiode.getBis()))
						{

							final TreeItem<String> item = new TreeItem<>(abg.getName() + " " + abg.getVorname(),
									new ImageView(nodeImgAbgIcon));

							mainItem.getChildren().add(item);
							break;

						}
					}
				}

			}

			root.getChildren().add(mainItem);

		}
		wahlperiodeRoot = root;
		treeView.setRoot(root);
		treeView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<TreeItem<String>>) (observable,
				oldValue, newValue) -> setWebViewContent(observable, newValue));
		treeView.setEditable(false);
	}

	public void setVornameRoot(final TreeItem<String> vornameRoot)
	{
		this.vornameRoot = vornameRoot;
	}

	public void setWahlperiodeRoot(final TreeItem<String> wahlperiodeRoot)
	{
		this.wahlperiodeRoot = wahlperiodeRoot;
	}

	public void setWebViewContent(final ObservableValue<? extends TreeItem<String>> observable,
			final TreeItem<String> newValue)
	{
		if (conVorname == null)
			conVorname = DataHelper.getAllAbgVorname(landtag);

		if (newValue == null)
			return;

		con = DataHelper.getAllAbg(landtag);
		final WebEngine engine = webView.getEngine();

		if (newValue.getValue().equals("Nach Nachnamen") || newValue.getValue().equals("Nach Wahlperioden")
				|| newValue.getValue().equals("Nach Vornamen") || newValue.getValue().matches("^[A-Z]+$")
				|| newValue.getValue().matches(".*\\d.*"))
		{
			GUIHelper.setUpWebView(webView);

		} else if (newValue.getValue().equals("Suchergebnisse"))
		{
			GUIHelper.setUpWebView(webView);
			treeView.setRoot(defaultRoot);

		} else
		{
			String seite = abgSeite;
			HashMap<String, Abgeordneter> suchMap = con.getHashNachname();
			ArrayList<String> keys = con.getHashKeysNachname();
			Abgeordneter abg = null;

			for (final String string : keys)
			{

				if (string.toUpperCase().equals(newValue.getValue().toUpperCase()))
				{

					abg = suchMap.get(string);
				}
			}

			if (abg == null)
			{

				suchMap = conVorname.getHashVorname();
				keys = conVorname.getHashKeysVorname();

				for (final String string : keys)
				{

					if (string.toUpperCase().equals(newValue.getValue().toUpperCase()))
					{

						abg = suchMap.get(string);
					}
				}

			}

			if (abg != null)
			{
				String encoded = null;
				if (abg.getBild() != null)
				{
					encoded = Base64.encode(abg.getBild());
				}

				if (encoded != null)
				{
					seite = seite.replace("$bild$", encoded);
				}
				seite = seite.replace("$fullName$", abg.getVorname() + " " + abg.getName());
				seite = seite.replace("$name$", abg.getVorname());
				seite = seite.replace("$surName$", abg.getName());
				if (abg.getGebam() != null)
				{
					seite = seite.replace("$bDate$", format.format(abg.getGebam()));
				} else
				{
					seite = seite.replace("$bDate$", "keine Angabe");
				}
				seite = seite.replace("$gebOrt$", abg.getGebin());

				if (abg.getFam() != null)
				{
					seite = seite.replace("$famStand$", abg.getFam().getBezeichnung());
				} else
				{
					seite = seite.replace("$famStand$", "Keine Angabe");

				}

				if (abg.getKonf() != null)
				{
					seite = seite.replace("$konf$", abg.getKonf().getBezeichnung());
				} else
				{
					seite = seite.replace("$konf$", "Keine Angabe");
				}

				if (!abg.getSetOrdenAbg().isEmpty())
				{
					final Set<OrdenAbg> ord = abg.getSetOrdenAbg();
					for (final OrdenAbg ordenAbg : ord)
					{
						seite = seite.replace("$orden$", ordenAbg.getOrden().getBezeichnung());

					}

				} else
				{
					seite = seite.replace("$orden$", "kein Orden");
				}

				if (!abg.getSetParteiAbg().isEmpty())
				{
					final Set<ParteiAbg> parteiAbg = abg.getSetParteiAbg();
					for (final ParteiAbg parAbg : parteiAbg)
					{
						seite = seite.replace("$partei$", parAbg.getPartei().getBezeichnung());

						seite = seite.replace("$funkVon$", format.format(parAbg.getVon()));
						seite = seite.replace("$funkBis$", format.format(parAbg.getBis()));

					}

				}

				if (!abg.getSetParFktAbg().isEmpty())
				{
					final Set<ParFktAbg> parteiFkt = abg.getSetParFktAbg();
					for (final ParFktAbg parFkt : parteiFkt)
					{
						seite = seite.replace("$funktion$", parFkt.getParfkt().getBezeichnung());

					}

				}
				if (!abg.getSetKreisAbg().isEmpty())
				{
					final Set<KreisAbg> kreis = abg.getSetKreisAbg();
					for (final KreisAbg kreisAbg : kreis)
					{
						seite = seite.replace("$kreis$", kreisAbg.getKreis().getBezeichnung());
						seite = seite.replace("$kreisVon$", format.format(kreisAbg.getVon()));
						seite = seite.replace("$kreisBis$", format.format(kreisAbg.getBis()));

					}

				}

			}

			engine.loadContent(seite);

		}
	}

}
