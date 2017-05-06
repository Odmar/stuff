package de.nm.ltxml.core;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVImport
{

	private static int fktpabg = 1;
	final static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	final static SimpleDateFormat format2 = new SimpleDateFormat("yyyy.MM.d");
	final static SimpleDateFormat format3 = new SimpleDateFormat("yyyy");
	final static SimpleDateFormat format4 = new SimpleDateFormat("yyyy.MM");
	private static int kabgid = 1;
	private static BayLandtag landtag = new BayLandtag();
	private static int ordabid = 1;
	private static int pabgid = 1;
	private static int regabgid = 1;

	public static Iterator<CSVRecord> csvLesen(final File f) throws IOException
	{

		return CSVParser.parse(f, StandardCharsets.UTF_8, CSVFormat.EXCEL.withHeader()).iterator();

	}

	public static void erzeugeAbg() throws IOException, ParseException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/abgeordneter.csv"));

		while (i.hasNext())
		{
			final CSVRecord record = i.next();
			final Abgeordneter abg = new Abgeordneter("a" + record.get("id"));
			abg.setName(record.get("Name"));
			abg.setVorname(record.get("Vorname"));
			abg.setTitel(record.get("Titel"));
			abg.setBeruf(record.get("Beruf"));
			abg.setGebam(record.get("geb_am"));
			abg.setGebin(record.get("geb_in"));
			abg.setGesam(record.get("ges_am"));
			abg.setGesin(record.get("ges_in"));
			abg.setFam(landtag.getFamHash().get("f" + record.get("f_id")));

			abg.setKonf(landtag.getKonfHash().get("k" + record.get("k_id")));
			final Iterator<CSVRecord> j = csvLesen(new File("src/csv/bild.csv"));
			while (j.hasNext())
			{

				final CSVRecord rc = j.next();
				if (record.get("Name").equals(rc.get("Name")) && record.get("Vorname").equals(rc.get("Vorname")))
				{
					if (!rc.get("bild").equals("null"))
					{
						abg.setBild(getBytes(rc.get("bild")));
						// System.out.println(rc.get("bild"));
					}
				}
			}

			landtag.add(abg);
		}

	}

	public static void erzeugeFam() throws IOException
	{

		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/familienstand.csv"));
		while (i.hasNext())
		{
			final CSVRecord record = i.next();
			final Familienstand fam = new Familienstand("f" + record.get("id"));
			fam.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(fam);
		}
	}

	public static void erzeugeKonf() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/konfession.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Konfession konf = new Konfession();
			konf.setId("k" + record.get("id"));
			konf.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(konf);

		}
	}

	public static void erzeugeKreis() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/kreis.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Kreis kreis = new Kreis("kr" + record.get("id"));
			kreis.setType(record.get("Type"));
			kreis.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(kreis);
		}
	}

	public static void erzeugeOrdAbg() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/zt_ord_abg.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final OrdenAbg ordenAbg = new OrdenAbg("ordabg" + ordabid);
			ordabid++;
			ordenAbg.setOrden(landtag.getOrdenHash().get("ord" + record.get("o_id")));
			ordenAbg.setAbg(landtag.getAbgeordneterHash().get("a" + record.get("a_id")));
			landtag.add(ordenAbg);
		}
	}

	public static void erzeugeOrden() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/orden.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Orden ord = new Orden("ord" + record.get("id"));
			ord.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(ord);
		}
	}

	public static void erzeugeParFkt() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/parfkt.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final ParFkt pfkt = new ParFkt("pf" + record.get("id"));
			pfkt.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(pfkt);

		}
	}

	public static void erzeugePartei() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/partei.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Partei pa = new Partei("p" + record.get("id"));
			pa.setName(record.get("Name"));
			pa.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(pa);
		}
	}

	public static void erzeugeParteiAbg() throws IOException
	{

		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/zt_partei_abg.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final ParteiAbg parAbg = new ParteiAbg("pabg" + pabgid);
			pabgid++;
			parAbg.setPartei(landtag.getParteiHash().get("p" + record.get("p_id")));
			parAbg.setAbg(landtag.getAbgeordneterHash().get("a" + record.get("a_id")));
			parAbg.setVon(record.get("von"));
			parAbg.setBis(record.get("bis"));
			landtag.add(parAbg);
		}

	}

	public static void erzeugeRegAbg() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/zt_reg_abg.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final StaatAbg staatAbg = new StaatAbg("regabg" + regabgid);
			regabgid++;
			staatAbg.setAbg(landtag.getAbgeordneterHash().get("a" + record.get("a_id")));
			staatAbg.setStaat(landtag.getStaatHash().get("s" + record.get("s_id")));
			staatAbg.setVon(record.get("von"));
			staatAbg.setBis(record.get("bis"));
			landtag.add(staatAbg);
		}
	}

	public static void erzeugeStaat() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/staatsregierung.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Staatsregierung staat = new Staatsregierung("s" + record.get("id"));
			staat.setBezeichnung(record.get("Bezeichnung"));
			landtag.add(staat);

		}
	}

	public static void erzeugeWahlperiode() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/wahlperiode.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final Wahlperiode wahl = new Wahlperiode("w" + record.get("id"));
			wahl.setVon(record.get("von"));
			wahl.setBis(record.get("bis"));
			landtag.add(wahl);

		}
	}

	public static void erzeugeZtFktAbg() throws IOException
	{
		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/zt_fkt_abg.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final ParFktAbg parftktabg = new ParFktAbg("fktabg" + fktpabg);
			fktpabg++;
			parftktabg.setAbg(landtag.getAbgeordneterHash().get("a" + record.get("a_id")));
			parftktabg.setParfkt(landtag.getParFktHash().get("pf" + record.get("pa_id")));
			parftktabg.setVon(record.get("von"));
			parftktabg.setBis(record.get("bis"));
			parftktabg.setType(record.get("Typ"));
			landtag.add(parftktabg);
			;
		}
	}

	public static void erzeugeztKreisAbg() throws IOException
	{

		final Iterator<CSVRecord> i = csvLesen(new File("src/csv/zt_kreis_abg.csv"));
		while (i.hasNext())
		{

			final CSVRecord record = i.next();
			final KreisAbg kreisAbg = new KreisAbg("kabg" + kabgid);
			kabgid++;
			kreisAbg.setAbg(landtag.getAbgeordneterHash().get("a" + record.get("a_id")));
			kreisAbg.setKreis(landtag.getKreisHash().get("kr" + record.get("k_id")));
			kreisAbg.setVon(record.get("von"));
			kreisAbg.setBis(record.get("bis"));
			landtag.add(kreisAbg);
		}

	}

	public static void getBild(final Abgeordneter abg, final Iterator<CSVRecord> it) throws ParseException, IOException
	{

	}

	public static byte[] getBytes(final String ImageName) throws IOException
	{

		final File imgPath = new File("src/images/" + ImageName);

		return Files.readAllBytes(imgPath.toPath());

	}

	public static SimpleDateFormat getFormat()
	{
		return format;
	}

	public static void main(final String[] args)
	{
		final long timeStart = System.currentTimeMillis();
		try
		{
			erzeugeFam();
			erzeugeKonf();
			erzeugePartei();
			erzeugeKreis();
			erzeugeOrden();
			erzeugeStaat();
			erzeugeWahlperiode();
			erzeugeParFkt();
			erzeugeAbg();
			erzeugeOrdAbg();
			erzeugeParteiAbg();
			erzeugeRegAbg();
			erzeugeZtFktAbg();
			erzeugeztKreisAbg();

		} catch (final IOException e)
		{

			e.printStackTrace();
		} catch (final ParseException e)
		{

			e.printStackTrace();
		}

		try
		{

			final JAXBContext context = JAXBContext.newInstance(BayLandtag.class);
			final Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			final File output = new File("target/final.xml");
			m.marshal(landtag, output);

		} catch (final PropertyException e)
		{

			e.printStackTrace();
		} catch (final JAXBException e)
		{
			e.printStackTrace();
		}

		final long timeEnd = System.currentTimeMillis();
		System.out.println("Laufzeit: " + (timeEnd - timeStart) + " Millisek.");

	}

	public static Date makeDate(final String date) throws ParseException
	{
		Date d = null;
		if (date.length() == 10)
		{
			d = format2.parse(date);
		}

		if (date.length() == 6)
		{
			d = format4.parse(date);
		}

		if (date.length() == 4)
		{
			d = format3.parse(date);
		}

		return d;
	}

}
