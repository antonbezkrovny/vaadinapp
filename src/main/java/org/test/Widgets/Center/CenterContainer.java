package org.test.Widgets.Center;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class CenterContainer extends HorizontalLayout {

    LeftMenu leftMenu = new LeftMenu();
    DashboardContainer dashboard = new DashboardContainer();

    public CenterContainer() {
        addComponent(leftMenu);
        setComponentAlignment(leftMenu, Alignment.TOP_LEFT);

        addComponent(dashboard);
        setComponentAlignment(dashboard, Alignment.TOP_LEFT);
        setStyleName("b");
    }
}
