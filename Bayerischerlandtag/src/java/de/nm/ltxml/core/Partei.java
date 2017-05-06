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
public class Partei extends Bezeichnung
{

	@XmlAttribute
	private String name;
	@XmlElement(name = "pabg")
	@XmlIDREF
	@XmlElementWrapper(name = "parteiabg")
	private final Set<ParteiAbg> setParteiAbg = new HashSet<>();

	public Partei()
	{
		super();
		name = "??";

	}

	public Partei(final String string)
	{
		super(string);
	}

	public Partei(final String id, final String neuerName, final String bezeichnung)
	{
		super(id, bezeichnung);
		name = neuerName;

	}

	public void add(final ParteiAbg pabg)
	{
		setParteiAbg.add(pabg);
	}

	public String getName()
	{
		return name;
	}

	public Set<ParteiAbg> getSetParteiAbg()
	{

		return setParteiAbg;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder();
		sb.append("Partei: ").append("name=").append(name).append(", ").append(super.toString());
		return sb.toString();
	}

}
