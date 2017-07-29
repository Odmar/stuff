package de.webapp.FirstWebApp;

import com.vaadin.annotations.Theme;
import com.vaadin.data.Binder;
import com.vaadin.data.ValidationException;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.ErrorEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

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
public class Login
{
	TextField name;
	PasswordField password;
	LoginEntity log = new LoginEntity();

	Binder<LoginEntity> binder = new Binder<>(LoginEntity.class);


	public Login()
	{
		

	}


	public void buildLoginPage(VerticalLayout layout)
	{
		layout.removeAllComponents();
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

		Label loginLabel = new Label("Login");
		loginLabel.addStyleName(ValoTheme.LABEL_H4);

		name = new TextField("Username");
		password = new PasswordField("Password");
		Button login = new Button("Login");
		login.addClickListener(click -> {
			binder.bindInstanceFields(this);
			try
			{
				binder.writeBean(log);
			} catch (ValidationException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (log.getName().equals(log.getfName()) || log.getPassword().equals(log.getfPassword()))
			{

				MainPage.buildMainPage(layout);

			} else
			{
				Notification.show("Ungültige kombnation von Username und Passwort!");
			
			}

		});
		login.setClickShortcut(KeyCode.ENTER);

		login.addStyleNames(ValoTheme.BUTTON_PRIMARY);

		ThemeResource resource = new ThemeResource("img/elk2.png");

		Image elk = new Image("", resource);
		elk.setWidth("10%");

		layout.addComponent(loginLabel);
		layout.addComponent(name);
		layout.addComponent(password);
		layout.addComponent(login);
		layout.addComponent(elk);

	}

}
