package de.nm.ltxml.core;

public class Familienstand extends Bezeichnung
{
	public Familienstand()
	{
		super();
	}

	public Familienstand(final String string)
	{
		super(string);
	}

	public Familienstand(final String neueID, final String neueBezeichnung)
	{
		super(neueID, neueBezeichnung);

	}

	@Override
	public String toString()
	{
		return super.getBezeichnung();

	}
}
