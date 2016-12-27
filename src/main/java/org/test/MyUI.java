package org.test;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.test.Widgets.Center.CenterContainer;
import org.test.Widgets.Top.TopContainer;

import javax.servlet.annotation.WebServlet;


@Theme("mytheme")
@Title("TP_Mon")

public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        TopContainer topBar = new TopContainer();
        CenterContainer centerBar = new CenterContainer();
        VerticalLayout content = new VerticalLayout();

        setContent(content);

        content.addComponent(topBar); //horizontal
        content.addComponent(centerBar);
        setSizeFull();
        //content.addComponent(centerBar); //vertical again, include left menu and dashboard
        setStyleName("b");
        //content.setMargin(new MarginInfo(false, true, false, true));
    }

    @WebServlet(urlPatterns = "/*", name = "Title", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class TP_MonServlet extends VaadinServlet {
    }

}