package org.test.Widgets.Top;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;


public class LeftPanel extends HorizontalLayout {

    public LeftPanel(String logoText) {

        Label logo = new Label(logoText);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        addComponent(logo);
        setMargin(true);
        setSizeFull();
        setSpacing(true);
        setStyleName("b");
    }
}
