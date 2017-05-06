package de.nm.ltxml.util;

import java.util.List;

import de.nm.ltxml.core.Abgeordneter;
import de.nm.ltxml.core.BayLandtag;
import de.nm.ltxml.core.KreisAbg;
import de.nm.ltxml.core.Wahlperiode;

public class DataHelper
{
	public static ArrayListContainerAlphabet getAllAbg(final BayLandtag landtag)
	{

		final ArrayListContainerAlphabet con = new ArrayListContainerAlphabet();

		for (final Abgeordneter abgeordneter : landtag.getAbgeordnete())
		{
			if (abgeordneter.getName().startsWith("A") || abgeordneter.getName().startsWith("a"))
			{

				con.getA().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("B") || abgeordneter.getName().startsWith("b"))
			{
				con.getB().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("C") || abgeordneter.getName().startsWith("c"))
			{
				con.getC().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("D") || abgeordneter.getName().startsWith("d"))
			{
				con.getD().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("E") || abgeordneter.getName().startsWith("e"))
			{
				con.getE().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("F") || abgeordneter.getName().startsWith("f"))
			{
				con.getF().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("G") || abgeordneter.getName().startsWith("g"))
			{
				con.getG().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("H") || abgeordneter.getName().startsWith("h"))
			{
				con.getH().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("I") || abgeordneter.getName().startsWith("i"))
			{
				con.getI().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("J") || abgeordneter.getName().startsWith("j"))
			{
				con.getJ().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("K") || abgeordneter.getName().startsWith("k"))
			{
				con.getK().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("L") || abgeordneter.getName().startsWith("l"))
			{
				con.getL().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("M") || abgeordneter.getName().startsWith("m"))
			{
				con.getM().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("N") || abgeordneter.getName().startsWith("n"))
			{
				con.getN().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("O") || abgeordneter.getName().startsWith("o"))
			{
				con.getO().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("P") || abgeordneter.getName().startsWith("p"))
			{
				con.getP().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("Q") || abgeordneter.getName().startsWith("q"))
			{
				con.getQ().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("R") || abgeordneter.getName().startsWith("r"))
			{
				con.getR().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("S") || abgeordneter.getName().startsWith("s"))
			{
				con.getS().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("T") || abgeordneter.getName().startsWith("t"))
			{
				con.getT().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("U") || abgeordneter.getName().startsWith("u"))
			{
				con.getU().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("V") || abgeordneter.getName().startsWith("v"))
			{
				con.getV().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("W") || abgeordneter.getName().startsWith("w"))
			{
				con.getW().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("X") || abgeordneter.getName().startsWith("x"))
			{
				con.getX().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("Y") || abgeordneter.getName().startsWith("y"))
			{
				con.getY().add(abgeordneter);
			} else if (abgeordneter.getName().startsWith("Z") || abgeordneter.getName().startsWith("z"))
			{
				con.getZ().add(abgeordneter);
			}

		}

		return con;
	}

	public static ArrayListContainerAlphabet getAllAbgVorname(final BayLandtag landtag)
	{

		final ArrayListContainerAlphabet con = new ArrayListContainerAlphabet();

		for (final Abgeordneter abgeordneter : landtag.getAbgeordnete())
		{
			if (abgeordneter.getVorname().startsWith("A") || abgeordneter.getVorname().startsWith("a"))
			{

				con.getA().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("B") || abgeordneter.getVorname().startsWith("b"))
			{
				con.getB().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("C") || abgeordneter.getVorname().startsWith("c"))
			{
				con.getC().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("D") || abgeordneter.getVorname().startsWith("d"))
			{
				con.getD().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("E") || abgeordneter.getVorname().startsWith("e"))
			{
				con.getE().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("F") || abgeordneter.getVorname().startsWith("f"))
			{
				con.getF().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("G") || abgeordneter.getVorname().startsWith("g"))
			{
				con.getG().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("H") || abgeordneter.getVorname().startsWith("h"))
			{
				con.getH().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("I") || abgeordneter.getVorname().startsWith("i"))
			{
				con.getI().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("J") || abgeordneter.getVorname().startsWith("j"))
			{
				con.getJ().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("K") || abgeordneter.getVorname().startsWith("k"))
			{
				con.getK().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("L") || abgeordneter.getVorname().startsWith("l"))
			{
				con.getL().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("M") || abgeordneter.getVorname().startsWith("m"))
			{
				con.getM().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("N") || abgeordneter.getVorname().startsWith("n"))
			{
				con.getN().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("O") || abgeordneter.getVorname().startsWith("o"))
			{
				con.getO().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("P") || abgeordneter.getVorname().startsWith("p"))
			{
				con.getP().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("Q") || abgeordneter.getVorname().startsWith("q"))
			{
				con.getQ().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("R") || abgeordneter.getVorname().startsWith("r"))
			{
				con.getR().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("S") || abgeordneter.getVorname().startsWith("s"))
			{
				con.getS().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("T") || abgeordneter.getVorname().startsWith("t"))
			{
				con.getT().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("U") || abgeordneter.getVorname().startsWith("u"))
			{
				con.getU().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("V") || abgeordneter.getVorname().startsWith("v"))
			{
				con.getV().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("W") || abgeordneter.getVorname().startsWith("w"))
			{
				con.getW().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("X") || abgeordneter.getVorname().startsWith("x"))
			{
				con.getX().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("Y") || abgeordneter.getVorname().startsWith("y"))
			{
				con.getY().add(abgeordneter);
			} else if (abgeordneter.getVorname().startsWith("Z") || abgeordneter.getVorname().startsWith("z"))
			{
				con.getZ().add(abgeordneter);
			}

		}
		return con;
	}

	public static String getWahlperiode(final BayLandtag landtag)
	{

		final List<Wahlperiode> wahlList = landtag.getWahlperiode();
		final List<Abgeordneter> abgList = landtag.getAbgeordnete();

		for (final Wahlperiode wahl : wahlList)
		{
			for (final Abgeordneter abg : abgList)
			{
				for (final KreisAbg kabg : abg.getSetKreisAbg())
				{
					if (kabg.getVon().equals(wahl.getVon()) && kabg.getBis().equals(wahl.getBis()))
					{

					}
				}
			}

		}

		return null;
	}
}
