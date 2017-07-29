package de.webapp.FirstWebApp;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("mytheme")
public class MainController extends UI
{
Navigator nav;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4375267423057375400L;

	@Override
	protected void init(VaadinRequest vaadinRequest)
	{
		
		getPage().setTitle("Meine App");
		final VerticalLayout layout = new VerticalLayout();
		Login login = new Login();
		login.buildLoginPage(layout);
		setContent(layout);
		
		
		
	}

}
