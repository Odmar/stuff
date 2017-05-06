package de.nm.ltxml.core;

import java.text.ParseException;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;

public class ParteiAbg extends Base
{
	@XmlIDREF
	@XmlAttribute
	private Abgeordneter abg;
	@XmlAttribute
	private Date bis;
	@XmlIDREF
	@XmlAttribute
	private Partei partei;
	@XmlAttribute
	private Date von;

	public ParteiAbg()
	{
		super();
	}

	public ParteiAbg(final String id)
	{
		super(id);
	}

	public Abgeordneter getAbg()
	{
		return abg;
	}

	public Date getBis()
	{
		return bis;
	}

	public Partei getPartei()
	{
		return partei;
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

	public void setPartei(final Partei partei)
	{
		this.partei = partei;
		partei.add(this);
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
		builder.append("ParteiAbg: ").append("id=").append(id).append(", ").append("abg=").append(abg.toString())
				.append(", ").append("partei=").append(partei.toString()).append(", ").append("von=").append(von)
				.append(", ").append("bis=").append(bis);
		return builder.toString();
	}

}
