package de.nm.ltxml.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.jdom2.JDOMException;

import de.nm.ltxml.core.BayLandtag;
import de.nm.ltxml.util.DataHelper;
import de.nm.ltxml.util.GUIHelper;
import de.nm.ltxml.util.TreeViewHelper;
import de.nm.ltxml.util.XmlHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;

public class MainPageController
{
	private static double deviderPosition = 0.2505567928730512;

	@FXML
	private AnchorPane anchorpane;

	@FXML
	private MenuItem help;

	private BayLandtag landtag = null;
	@FXML
	private URL location;
	@FXML
	private MenuBar menuBar;
	@FXML
	private MenuItem nachnameSort;

	@FXML
	private MenuItem resetWindow;

	@FXML
	private ResourceBundle resources;

	@FXML
	private ScrollPane scrollPane;

	@FXML
	private SplitPane splitpane;
	@FXML
	private TextField textfield;

	private TreeViewHelper treeHelper;

	@FXML
	private TreeView<String> treeView;

	@FXML
	private MenuItem vornameSort;

	@FXML
	private MenuItem wahlperiodeSort;
	@FXML
	private WebView webView;

	@FXML
	void enterText(final ActionEvent event)
	{

	}

	@FXML
	void fillTree(final ActionEvent event)
	{

	}

	@FXML
	void helpAction(final ActionEvent event)
	{
		GUIHelper.setUpWebInfo(webView);

	}

	@FXML
	void initialize()
	{

		try
		{
			landtag = XmlHelper.getLandtagXml();
		} catch (final JDOMException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		treeHelper = new TreeViewHelper(treeView, webView, landtag);

		treeHelper.setUpTree();
		GUIHelper.setUpWebView(webView);

	}

	@FXML
	void nachnameSortAction(final ActionEvent event)
	{
		if (treeHelper.getDefaultRoot() != null)
		{
			treeView.setRoot(treeHelper.getDefaultRoot());
		} else
		{
			treeHelper.setUpTree();
		}

		splitpane.setDividerPositions(deviderPosition);

	}

	@FXML
	void resetWindowAction(final ActionEvent event)
	{

		splitpane.setDividerPositions(deviderPosition);
		treeHelper.setDefaultRoot(null);
		treeHelper.setVornameRoot(null);
		treeHelper.setWahlperiodeRoot(null);
		GUIHelper.setUpWebView(webView);

		treeHelper.setUpTree();

	}

	@FXML
	void selectedText(final ActionEvent event)
	{
		treeHelper.setUpTreeSuche(textfield);
		textfield.setText("");

		splitpane.setDividerPositions(deviderPosition);

	}

	@FXML
	void vornameSortAction(final ActionEvent event)
	{
		if (treeHelper.getConVorname() == null)
		{
			treeHelper.setConVorname(DataHelper.getAllAbgVorname(landtag));
		}
		if (treeHelper.getVornameRoot() == null)
		{
			treeHelper.setUpTreeVorname();
		} else
		{
			treeView.setRoot(treeHelper.getVornameRoot());
		}

		splitpane.setDividerPositions(deviderPosition);

	}

	@FXML
	void wahlperiodeSortAction(final ActionEvent event)
	{
		if (treeHelper.getWahlperiodeRoot() == null)
		{
			treeHelper.setUpTreeWhalperiode();
		} else
		{
			treeView.setRoot(treeHelper.getWahlperiodeRoot());
		}

		splitpane.setDividerPositions(deviderPosition);

	}
}
