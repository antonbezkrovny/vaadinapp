package org.test.Widgets.Center.WidgetCampaingReport;

import com.vaadin.ui.*;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class WidgetLeftPanel extends VerticalLayout {


    Label widgetName = new Label("Настройки");
    ComboBox selectCompany = new ComboBox("Выберите компанию");
    TextField findText = new TextField("Фильтр по подразделениям");
    CheckBox showTrend = new CheckBox("Показывать тренд");
    CheckBox show50DaysLine = new CheckBox("Показывать огибающую");

    WidgetLeftPanel() {
        addComponents(widgetName, selectCompany, findText, showTrend, show50DaysLine);
        setMargin(true);
        setSpacing(true);
        setStyleName("b");
    }
}
