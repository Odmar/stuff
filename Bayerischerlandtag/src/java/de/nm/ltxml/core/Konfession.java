package de.nm.ltxml.core;

public class Konfession extends Bezeichnung
{

	public Konfession()
	{
		super();
	}

	public Konfession(final String string)
	{
		super(string);
	}

	public Konfession(final String neueID, final String neueBezeichnung)
	{
		super(neueID, neueBezeichnung);

	}

	@Override
	public String toString()
	{
		return super.getBezeichnung();

	}
}
