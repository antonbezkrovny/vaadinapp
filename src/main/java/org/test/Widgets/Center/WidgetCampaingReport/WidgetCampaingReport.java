package org.test.Widgets.Center.WidgetCampaingReport;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class WidgetCampaingReport extends HorizontalLayout {
    WidgetLeftPanel leftPanel = new WidgetLeftPanel();
    WidgetRightPanel rightPanel = new WidgetRightPanel();
    WidgetCenterPanel centerPanel = new WidgetCenterPanel();
    public WidgetCampaingReport() {
        addComponent(leftPanel);
        setComponentAlignment(leftPanel, Alignment.TOP_LEFT);
        addComponent(centerPanel);
        setComponentAlignment(centerPanel, Alignment.TOP_LEFT);
        addComponent(rightPanel);
        setComponentAlignment(centerPanel, Alignment.TOP_LEFT);
        setStyleName("b");
    }
}
