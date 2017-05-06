package de.nm.ltxml.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "baylandtag")
@XmlAccessorType(XmlAccessType.FIELD)
public class BayLandtag
{
	@XmlElement(name = "abg")
	@XmlElementWrapper(name = "abgeordnete")
	private final List<Abgeordneter> abgeordnete = new ArrayList<>();
	@XmlTransient
	private final Map<String, Abgeordneter> abgeordneterHash = new HashMap<>();
	@XmlTransient
	private final Map<String, Familienstand> famHash = new HashMap<>();
	@XmlElement(name = "fam")
	@XmlElementWrapper(name = "familie")
	private final List<Familienstand> familienstaende = new ArrayList<>();
	@XmlElement(name = "konf")
	@XmlElementWrapper(name = "konfession")
	private final List<Konfession> konfessionen = new ArrayList<>();
	@XmlTransient
	private final Map<String, Konfession> konfHash = new HashMap<>();
	@XmlElement(name = "kr")
	@XmlElementWrapper(name = "kreis")
	private final List<Kreis> kreis = new ArrayList<>();
	@XmlElement(name = "krbg")
	@XmlElementWrapper(name = "kreisabg")
	private final List<KreisAbg> kreisAbg = new ArrayList<>();
	@XmlTransient
	private final Map<String, Kreis> kreisHash = new HashMap<>();

	@XmlElement(name = "ord")
	@XmlElementWrapper(name = "orden")
	private final List<Orden> orden = new ArrayList<>();
	@XmlElement(name = "oabg")
	@XmlElementWrapper(name = "ordenabg")
	private final List<OrdenAbg> ordenabg = new ArrayList<>();
	@XmlTransient
	private final Map<String, Orden> ordenHash = new HashMap<>();

	@XmlElement(name = "pf")
	@XmlElementWrapper(name = "parfkt")
	private final List<ParFkt> parFkt = new ArrayList<>();
	@XmlElement(name = "kabg")
	@XmlElementWrapper(name = "kreisabg")
	private final List<ParFktAbg> parFktAbg = new ArrayList<>();
	@XmlTransient
	private final Map<String, ParFkt> parFktHash = new HashMap<>();

	@XmlElement(name = "pa")
	@XmlElementWrapper(name = "partei")
	private final List<Partei> partei = new ArrayList<>();
	@XmlElement(name = "pabg")
	@XmlElementWrapper(name = "parteiabg")
	private final List<ParteiAbg> parteiabg = new ArrayList<>();
	@XmlTransient
	private final Map<String, Partei> parteiHash = new HashMap<>();

	@XmlElement(name = "sabg")
	@XmlElementWrapper(name = "staatabg")
	private final List<StaatAbg> staatabg = new ArrayList<>();
	@XmlTransient
	private final Map<String, Staatsregierung> staatHash = new HashMap<>();
	@XmlElement(name = "staat")
	@XmlElementWrapper(name = "staatsregierung")
	private final List<Staatsregierung> staatsregierung = new ArrayList<>();

	@XmlElement(name = "wahl")
	@XmlElementWrapper(name = "wahlperiode")
	private final List<Wahlperiode> wahlperiode = new ArrayList<>();

	public void add(final Abgeordneter abg)
	{
		abgeordnete.add(abg);
		abgeordneterHash.put(abg.getId(), abg);
	}

	public void add(final Familienstand fam)
	{
		familienstaende.add(fam);
		famHash.put(fam.getId(), fam);
	}

	public void add(final Konfession konf)
	{
		konfessionen.add(konf);
		konfHash.put(konf.getId(), konf);

	}

	public void add(final Kreis kr)
	{
		kreis.add(kr);
		kreisHash.put(kr.getId(), kr);

	}

	public void add(final KreisAbg krbg)
	{
		kreisAbg.add(krbg);

	}

	public void add(final Orden ord)
	{
		orden.add(ord);
		ordenHash.put(ord.getId(), ord);

	}

	public void add(final OrdenAbg orbg)
	{
		ordenabg.add(orbg);

	}

	public void add(final ParFkt pf)
	{
		parFkt.add(pf);
		parFktHash.put(pf.getId(), pf);

	}

	public void add(final ParFktAbg pfbg)
	{
		parFktAbg.add(pfbg);

	}

	public void add(final Partei pa)
	{
		partei.add(pa);
		parteiHash.put(pa.getId(), pa);

	}

	public void add(final ParteiAbg pabg)
	{
		parteiabg.add(pabg);

	}

	public void add(final StaatAbg stbg)
	{
		staatabg.add(stbg);

	}

	public void add(final Staatsregierung staat)
	{
		staatsregierung.add(staat);
		staatHash.put(staat.getId(), staat);

	}

	public void add(final Wahlperiode wahl)
	{
		wahlperiode.add(wahl);
	}

	public List<Abgeordneter> getAbgeordnete()
	{
		return abgeordnete;
	}

	public Map<String, Abgeordneter> getAbgeordneterHash()
	{
		return abgeordneterHash;
	}

	public Map<String, Familienstand> getFamHash()
	{
		return famHash;
	}

	public List<Familienstand> getFamilienstaende()
	{
		return familienstaende;
	}

	public List<Konfession> getKonfessionen()
	{
		return konfessionen;
	}

	public Map<String, Konfession> getKonfHash()
	{
		return konfHash;
	}

	public List<Kreis> getKreis()
	{
		return kreis;
	}

	public List<KreisAbg> getKreisAbg()
	{
		return kreisAbg;
	}

	public Map<String, Kreis> getKreisHash()
	{
		return kreisHash;
	}

	public List<Orden> getOrden()
	{
		return orden;
	}

	public List<OrdenAbg> getOrdenabg()
	{
		return ordenabg;
	}

	public Map<String, Orden> getOrdenHash()
	{
		return ordenHash;
	}

	public List<ParFkt> getParFkt()
	{
		return parFkt;
	}

	public List<ParFktAbg> getParFktAbg()
	{
		return parFktAbg;
	}

	public Map<String, ParFkt> getParFktHash()
	{
		return parFktHash;
	}

	public List<Partei> getPartei()
	{
		return partei;
	}

	public List<ParteiAbg> getParteiabg()
	{
		return parteiabg;
	}

	public Map<String, Partei> getParteiHash()
	{
		return parteiHash;
	}

	public List<StaatAbg> getStaatabg()
	{
		return staatabg;
	}

	public Map<String, Staatsregierung> getStaatHash()
	{
		return staatHash;
	}

	public List<Staatsregierung> getStaatsregierung()
	{
		return staatsregierung;
	}

	public List<Wahlperiode> getWahlperiode()
	{
		return wahlperiode;
	}

}
