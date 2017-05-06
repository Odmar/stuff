package de.nm.ltxml.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Wahlperiode extends Base
{

	private Date bis;
	private Date von;

	public Wahlperiode()
	{
		super();
	}

	public Wahlperiode(final String string)
	{
		super(string);
	}

	public Date getBis()
	{
		return bis;
	}

	public Date getVon()
	{
		return von;
	}

	public void setBis(final Date date)
	{
		bis = date;
	}

	public void setBis(final String bis)
	{
		final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try
		{
			this.bis = format.parse(bis);
		} catch (final ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setVon(final Date date)
	{

		von = date;
	}

	public void setVon(final String von)
	{

		final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try
		{
			this.von = format.parse(von);
		} catch (final ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
