package de.nm.ltxml.core;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public class Abgeordneter extends Base
{
	@XmlAttribute
	private String beruf;

	@XmlElement(name = "bild")
	private byte[] bild;
	@XmlIDREF
	@XmlAttribute
	private Familienstand fam;

	@XmlAttribute
	private Date gebam;

	@XmlAttribute
	private String gebin;

	@XmlAttribute
	private Date gesam;

	@XmlAttribute
	private String gesin;

	@XmlAttribute
	@XmlIDREF
	private Konfession konf;

	@XmlAttribute
	private String name;

	@XmlElement(name = "krbg")
	@XmlIDREF
	@XmlElementWrapper(name = "kreisabg")
	private final Set<KreisAbg> setKreisAbg = new HashSet<>();

	@XmlElement(name = "ordabg")
	@XmlIDREF
	@XmlElementWrapper(name = "ordensabg")
	private final Set<OrdenAbg> setOrdenAbg = new HashSet<>();;

	@XmlElement(name = "pabg")
	@XmlIDREF
	@XmlElementWrapper(name = "parteifktabg")
	private final Set<ParFktAbg> setParFktAbg = new HashSet<>();

	@XmlElement(name = "pabg")
	@XmlIDREF
	@XmlElementWrapper(name = "parteiabg")
	private final Set<ParteiAbg> setParteiAbg = new HashSet<>();

	@XmlElement(name = "stabg")
	@XmlIDREF
	@XmlElementWrapper(name = "staatsabg")
	private final Set<StaatAbg> setStaatAbg = new HashSet<>();

	@XmlAttribute
	private String titel;

	@XmlAttribute
	private String vorname;

	public Abgeordneter()
	{
		super();
		name = "??";
		vorname = "??";

	}

	public Abgeordneter(final String string)
	{
		super(string);
	}

	public Abgeordneter(final String neueID, final String neuerName, final String neuerVorname)
	{
		super(neueID);
		name = neuerName;
		vorname = neuerVorname;
		titel = "??";
		beruf = "??";
		gebin = "??";
		gesin = "??";

	}

	public void add(final KreisAbg kreisAbg)
	{
		setKreisAbg.add(kreisAbg);

	}

	public void add(final OrdenAbg ordenabg)
	{
		setOrdenAbg.add(ordenabg);
	}

	public void add(final ParFktAbg pafktabg)
	{
		setParFktAbg.add(pafktabg);
	}

	public void add(final ParteiAbg pabg)
	{
		setParteiAbg.add(pabg);
	}

	public void add(final StaatAbg sabg)
	{
		setStaatAbg.add(sabg);
	}

	public String getBeruf()
	{
		return beruf;
	}

	public byte[] getBild()
	{
		return bild;
	}

	public Familienstand getFam()
	{
		return fam;
	}

	public Date getGebam()
	{

		return gebam;
	}

	public String getGebin()
	{
		return gebin;
	}

	public Date getGesam()
	{
		return gesam;
	}

	public String getGesin()
	{
		return gesin;
	}

	public Konfession getKonf()
	{
		return konf;
	}

	public String getName()
	{
		return name;
	}

	public Set<KreisAbg> getSetKreisAbg()
	{
		return setKreisAbg;
	}

	public Set<OrdenAbg> getSetOrdenAbg()
	{
		return setOrdenAbg;
	}

	public Set<ParFktAbg> getSetParFktAbg()
	{

		return setParFktAbg;
	}

	public Set<ParteiAbg> getSetParteiAbg()
	{
		return setParteiAbg;
	}

	public Set<StaatAbg> getSetStaatAbg()
	{
		return setStaatAbg;
	}

	public String getTitel()
	{
		return titel;
	}

	public String getVorname()
	{
		return vorname;
	}

	public List<Wahlperiode> getWahlperioden()
	{
		final List<Wahlperiode> ergebnis = new ArrayList<>();

		for (final ParFktAbg pafkt : setParFktAbg)
		{
			final Wahlperiode wahl = new Wahlperiode();
			wahl.setBis(pafkt.getBis());
			wahl.setVon(pafkt.getVon());
			wahl.setId("ParteiFunktionsAbg");
			ergebnis.add(wahl);
		}

		for (final OrdenAbg oabg : setOrdenAbg)
		{
			final Wahlperiode wahl = new Wahlperiode();
			wahl.setBis(oabg.getBis());
			wahl.setVon(oabg.getVon());
			wahl.setId("OrdenAbg");
			ergebnis.add(wahl);
		}

		for (final KreisAbg kabg : setKreisAbg)
		{
			final Wahlperiode wahl = new Wahlperiode();
			wahl.setBis(kabg.getBis());
			wahl.setVon(kabg.getVon());
			wahl.setId("KreisAbg");
			ergebnis.add(wahl);
		}

		for (final StaatAbg sabg : setStaatAbg)
		{
			final Wahlperiode wahl = new Wahlperiode();
			wahl.setBis(sabg.getBis());
			wahl.setVon(sabg.getVon());
			wahl.setId("StaatAbg");
			ergebnis.add(wahl);
		}

		for (final ParteiAbg pabg : setParteiAbg)
		{
			final Wahlperiode wahl = new Wahlperiode();
			wahl.setBis(pabg.getBis());
			wahl.setVon(pabg.getVon());
			wahl.setId("ParteiAbg");
			ergebnis.add(wahl);
		}

		return ergebnis;
	}

	public void setBeruf(final String beruf)
	{
		this.beruf = beruf;
	}

	public void setBild(final byte[] readAllBytes)
	{
		bild = readAllBytes;

	}

	public void setFam(final Familienstand fam)
	{
		this.fam = fam;
	}

	public void setGebam(final String gebam)
	{

		if (gebam == null || gebam.equals("null"))
		{
			this.gebam = null;
		} else
		{
			try
			{
				this.gebam = CSVImport.getFormat().parse(gebam);
			} catch (final ParseException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setGebin(final String gebin)
	{
		this.gebin = gebin;
	}

	public void setGesam(final String gesam)
	{

		if (gesam == null || gesam.equals("null"))
		{
			this.gesam = null;

		} else
		{
			try
			{
				this.gesam = CSVImport.getFormat().parse(gesam);
			} catch (final ParseException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setGesin(final String gesin)
	{
		this.gesin = gesin;
	}

	public void setKonf(final Konfession konf)
	{
		this.konf = konf;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public void setTitel(final String titel)
	{
		this.titel = titel;
	}

	public void setVorname(final String vorname)
	{
		this.vorname = vorname;
	}

	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("Abgeordneter: ");
		builder.append("id=" + id);
		builder.append(", ");
		builder.append("name=" + name);
		builder.append(", ");
		builder.append("vorname=" + vorname);
		builder.append(", ");
		builder.append("titel=" + titel);
		builder.append(", ");
		builder.append("beruf=" + beruf);
		builder.append(", ");
		builder.append("gebam=" + gebam);
		builder.append(", ");
		builder.append("gebin=" + gebin);
		builder.append(", ");
		builder.append("gesam=" + gesam);
		builder.append(", ");
		builder.append("gesin=" + gesin);
		builder.append(", ");
		builder.append("konf=" + konf);
		builder.append(", ");
		builder.append("fam=" + fam);

		return builder.toString();
	}

}
