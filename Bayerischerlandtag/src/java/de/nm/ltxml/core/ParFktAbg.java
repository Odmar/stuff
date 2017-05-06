package de.nm.ltxml.core;

import java.text.ParseException;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;

public class ParFktAbg extends Base
{
	@XmlIDREF
	@XmlAttribute
	private Abgeordneter abg;
	@XmlAttribute
	private Date bis;
	@XmlIDREF
	@XmlAttribute
	private ParFkt parfkt;
	@XmlAttribute
	private String type;
	@XmlAttribute
	private Date von;

	public ParFktAbg()
	{
		super();
	}

	public ParFktAbg(final String string)
	{
		super(string);

	}

	public Abgeordneter getAbg()
	{
		return abg;
	}

	public Date getBis()
	{
		return bis;
	}

	public ParFkt getParfkt()
	{
		return parfkt;
	}

	public String getType()
	{
		return type;
	}

	public Date getVon()
	{
		return von;
	}

	public void setAbg(final Abgeordneter abg)
	{
		this.abg = abg;
		abg.add(this);
	}

	public void setBis(final String bis)
	{

		try
		{
			this.bis = CSVImport.getFormat().parse(bis);
		} catch (final ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setParfkt(final ParFkt parfkt)
	{
		this.parfkt = parfkt;
		parfkt.add(this);
	}

	public void setType(final String type)
	{
		this.type = type;
	}

	public void setVon(final String von)
	{

		try
		{
			this.von = CSVImport.getFormat().parse(von);
		} catch (final ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("ParFktAbg: ").append("id=").append(id).append(", ").append("abg=").append(abg.toString())
				.append(", ").append("type=").append(type).append(", parfkt=").append(parfkt.toString()).append(", ")
				.append("von=").append(von).append(", ").append("bis=").append(bis);
		return builder.toString();
	}

}
