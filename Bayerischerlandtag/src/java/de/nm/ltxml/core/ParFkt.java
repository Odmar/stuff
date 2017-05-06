package de.nm.ltxml.core;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;

public class ParFkt extends Bezeichnung
{
	@XmlElement(name = "pabg")
	@XmlIDREF
	@XmlElementWrapper(name = "parteiabg")
	private final Set<ParFktAbg> setParFktAbg = new HashSet<>();

	private String type;

	public ParFkt()
	{
		super();
	}

	public ParFkt(final String string)
	{
		super(string);
	}

	public ParFkt(final String id, final String bezeichnung)
	{
		super(id, bezeichnung);
	}

	public void add(final ParFktAbg parfktabg)
	{
		setParFktAbg.add(parfktabg);
	}

	public Set<ParFktAbg> getSetParFktAbg()
	{

		return setParFktAbg;
	}

	public String getType()
	{
		return type;
	}

	public void setType(final String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "ParFkt: " + super.toString();
	}

}
