package de.nm.ltxml.core;

import java.util.HashSet;
import java.util.Set;

public class Staatsregierung extends Bezeichnung
{

	private final Set<StaatAbg> setStaatAbg = new HashSet<>();

	public Staatsregierung()
	{
		super();
	}

	public Staatsregierung(final String string)
	{
		super(string);
	}

	public Staatsregierung(final String id, final String bezeichnung)
	{
		super(id, bezeichnung);
	}

	public void add(final StaatAbg sabg)
	{
		setStaatAbg.add(sabg);
	}

	public Set<StaatAbg> getSetStaatAbg()
	{
		return setStaatAbg;
	}

	@Override
	public String toString()
	{
		return "Staatsregierung: " + super.toString();
	}

}
