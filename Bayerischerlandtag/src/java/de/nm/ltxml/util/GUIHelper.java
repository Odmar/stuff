package de.nm.ltxml.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javafx.scene.web.WebView;

public class GUIHelper
{

	public static void createJpg(final byte[] args)
	{

		final File bild = new File("src/html/bild.jpg");
		try
		{
			bild.createNewFile();
		} catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream oStream = null;
		try
		{
			oStream = new FileOutputStream(bild);
		} catch (final FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try
		{
			oStream.write(args);
		} catch (final IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void setUpWebInfo(final WebView webView)
	{
		webView.setContextMenuEnabled(false);

		final URL url = GUIHelper.class.getClassLoader().getResource("info.html");

		String location = null;
		try
		{
			location = url.toURI().getPath();
		} catch (final URISyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(location);

		webView.getEngine().load("file://" + location);
	}

	public static void setUpWebView(final WebView webView)
	{
		webView.setContextMenuEnabled(false);

		final URL url = GUIHelper.class.getClassLoader().getResource("default.html");
		String location = null;
		try
		{
			location = url.toURI().getPath();
		} catch (final URISyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(location);

		webView.getEngine().load("file://" + location);

	}

}
