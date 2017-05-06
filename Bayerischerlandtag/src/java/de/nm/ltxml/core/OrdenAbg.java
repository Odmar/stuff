package de.nm.ltxml.core;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;

public class OrdenAbg extends Base
{
	@XmlIDREF
	@XmlAttribute
	private Abgeordneter abg;
	@XmlAttribute
	private Date bis;
	@XmlIDREF
	@XmlAttribute
	private Orden orden;
	@XmlAttribute
	private Date von;

	public OrdenAbg()
	{
		super();
	}

	public OrdenAbg(final String string)
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

	public Orden getOrden()
	{
		return orden;
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

	public void setBis(final Date bis)
	{
		this.bis = bis;
	}

	public void setOrden(final Orden orden)
	{
		this.orden = orden;
		orden.add(this);
	}

	public void setVon(final Date von)
	{
		this.von = von;
	}

	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("OrdenAbg: ").append("id=").append(id).append(", ").append("abg=").append(abg.toString())
				.append(", ").append("orden=").append(orden.toString());
		return builder.toString();
	}

}
