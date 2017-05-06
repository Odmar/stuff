package de.nm.ltxml.util;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.jdom2.JDOMException;

import de.nm.ltxml.core.BayLandtag;

public class XmlHelper
{

	public static BayLandtag getLandtagXml() throws JDOMException, IOException
	{
		BayLandtag landtag = null;

		JAXBContext jc;
		try
		{

			jc = JAXBContext.newInstance(BayLandtag.class);
			final Unmarshaller unmarshaller = jc.createUnmarshaller();
			final InputStream stream = XmlHelper.class.getClassLoader().getResourceAsStream("final.xml");

			landtag = (BayLandtag) unmarshaller.unmarshal(stream);

		} catch (final JAXBException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return landtag;

	}

}
