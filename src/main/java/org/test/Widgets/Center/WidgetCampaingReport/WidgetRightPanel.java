package org.test.Widgets.Center.WidgetCampaingReport;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.vaadin.addon.JFreeChartWrapper;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class WidgetRightPanel extends VerticalLayout {
    WidgetRightPanel() {
        Label chartName = new Label("Результаты компании");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String series1 = "HR";
        String series2 = "IT - Unix";
        String series3 = "IT - Windows";
        String series4 = "Руководство";

        dataset.addValue(5.0, series1, "2016.01.01");
        dataset.addValue(4.8, series1, "2016.05.01");

        dataset.addValue(3.6, series3, "2016.01.01");
        dataset.addValue(3.4, series3, "2016.05.01");

        dataset.addValue(3.2, series4, "2016.01.01");
        dataset.addValue(3.2, series4, "2016.05.01");

        JFreeChart chart = ChartFactory.createBarChart("", // Title
                "Years", // x-axis Label
                "Score", // y-axis Label
                dataset // Dataset
        );
        JFreeChartWrapper wrapper = new JFreeChartWrapper(chart) {
            @Override
            public void attach() {
                super.attach();
                //markAsDirty();
            }
        };
        wrapper.setWidth("600px");
        wrapper.setHeight("300px");
        setMargin(true);
        setSpacing(true);
        addComponent(chartName);
        addComponent(wrapper);
        //setStyleName("b");

    }
}
