package de.nm.ltxml.core;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlIDREF;

public class Orden extends Bezeichnung
{

	@XmlIDREF
	private final Set<OrdenAbg> setOrdenAbg = new HashSet<>();

	public Orden()
	{
		super();
	}

	public Orden(final String string)
	{
		super(string);
	}

	public Orden(final String neueid, final String neueBezeichnung)
	{
		super(neueid, neueBezeichnung);
	}

	public void add(final OrdenAbg ordenabg)
	{
		setOrdenAbg.add(ordenabg);
	}

	public Set<OrdenAbg> getSetOrdenAbg()
	{
		return setOrdenAbg;
	}

	@Override
	public String toString()
	{

		return "Orden: " + super.toString();
	}

}
