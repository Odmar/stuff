package de.webapp.FirstWebApp;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = MainController.class, productionMode = false)
public class MyUIServlet extends VaadinServlet
{

	
	private static final long serialVersionUID = 6015985480117841069L;

}