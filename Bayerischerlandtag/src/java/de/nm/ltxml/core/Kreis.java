package de.nm.ltxml.core;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public class Kreis extends Bezeichnung
{
	@XmlElement(name = "krbg")
	@XmlIDREF
	@XmlElementWrapper(name = "kreisabg")
	Set<KreisAbg> setKreisAbg = new HashSet<>();
	@XmlAttribute
	private String type;

	public Kreis()
	{
		super();
		type = "??";
	}

	public Kreis(final String string)
	{
		super(string);
	}

	public Kreis(final String id, final String neuerType, final String bezeichnung)
	{
		super(id, bezeichnung);
		type = neuerType;
	}

	public void add(final KreisAbg kreisAbg)
	{
		setKreisAbg.add(kreisAbg);

	}

	public Set<KreisAbg> getSetKreisAbg()
	{
		return setKreisAbg;
	}

	public String getType()
	{
		return type;
	}

	public void setKreisabg(final Set<KreisAbg> kreisabg)
	{
		this.setKreisAbg = kreisabg;
	}

	public void setType(final String typ)
	{
		this.type = typ;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("Kreis: ").append("type=").append(type).append(", ").append(super.toString());
		return sb.toString();
	}

}
