package de.webapp.FirstWebApp;

import com.vaadin.annotations.Theme;
import com.vaadin.shared.ui.dd.HorizontalDropLocation;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme("mytheme")
public class MainPage
{

	public static void buildMainPage(VerticalLayout layout)
	{
		layout.removeAllComponents();
		layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
		
	
		Panel pane = new Panel();
		buildHeader(pane);

		layout.addComponent(pane);
	}

	public static void buildHeader(Panel pane)
	{
		pane.setStyleName("v-panel");
		
		HorizontalLayout hl = new HorizontalLayout();
	
	
		Label logo = new Label("Awsome App");
		logo.addStyleName(ValoTheme.LABEL_H4);
		MenuBar menu = new MenuBar();
		menu.addStyleNames(ValoTheme.MENUBAR_BORDERLESS, ValoTheme.MENU_ROOT);
		
		MenuItem test1 = menu.addItem("test1", null);
		MenuItem testtest1 = test1.addItem("tester", null);
		MenuItem testtest2 = test1.addItem("tester", null);
		MenuItem testtest3 = test1.addItem("tester", null);
		MenuItem testtest4 = test1.addItem("tester", null);
	
		MenuItem test2 = menu.addItem("test2", null);
		MenuItem testtest5 = test2.addItem("tester", null);
		MenuItem testtest7 = test2.addItem("tester", null);
		MenuItem testtest8 = test2.addItem("tester", null);
		MenuItem testtest9 = test2.addItem("tester", null);
		hl.setWidth("100%");
		hl.addComponent(logo);
		hl.addComponent(menu);
		
		pane.setContent(hl);
	}

}
