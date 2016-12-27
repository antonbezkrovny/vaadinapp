package org.test.Widgets.Center;

import org.test.Widgets.Center.WidgetCampaingReport.WidgetCampaingReport;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class DashboardContainer extends HorizontalLayout {
    WidgetCampaingReport campaingReport = new WidgetCampaingReport();
    public DashboardContainer() {
        setSizeFull();
        addComponent(campaingReport);
        setStyleName("b");
    }
}
