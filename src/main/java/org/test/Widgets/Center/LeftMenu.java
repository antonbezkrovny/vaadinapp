package org.test.Widgets.Center;

import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class LeftMenu extends VerticalLayout {

    Button menuItem1 = new com.vaadin.ui.Button("Группы");
    Button menuItem2 = new com.vaadin.ui.Button("Шаблоны");
    Button menuItem3 = new com.vaadin.ui.Button("Кампании");
    Button menuItem4 = new com.vaadin.ui.Button("Настройки");

    public LeftMenu() {

        addComponents(menuItem1, menuItem2, menuItem3, menuItem4);
        menuItem1.setWidth("100px");
        menuItem1.addStyleName("tiny");
        menuItem2.setWidth("100px");
        menuItem2.addStyleName("tiny");
        menuItem3.setWidth("100px");
        menuItem3.addStyleName("tiny");
        menuItem4.setWidth("100px");
        menuItem4.addStyleName("tiny");

        setWidthUndefined();
        setHeight("100%");
        setSpacing(true);
        setMargin(true);
        setStyleName("b");
       }
}