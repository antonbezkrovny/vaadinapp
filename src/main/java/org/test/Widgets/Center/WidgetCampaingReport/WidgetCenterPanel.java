package org.test.Widgets.Center.WidgetCampaingReport;

import com.vaadin.shared.ui.MultiSelectMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Anton.Bezkrovnyy on 22.12.2016.
 */
public class WidgetCenterPanel extends VerticalLayout {
    WidgetCenterPanel () {
        Tree orgStruct = new Tree();
        Label org = new Label("Выберите подразделение");
        addComponent(org);
        addComponents(orgStruct);

        orgStruct.setMultiselectMode(MultiSelectMode.SIMPLE);
        orgStruct.setMultiSelect(true);
        orgStruct.addItem("Все подразделения");

        orgStruct.addItem("HR");
        orgStruct.setChildrenAllowed("HR", false);
        orgStruct.setParent("HR", "Все подразделения");

        orgStruct.addItem("IT");
        orgStruct.setChildrenAllowed("IT", true);
        orgStruct.setParent("IT", "Все подразделения");

        orgStruct.addItem("IT - Unix");
        orgStruct.setChildrenAllowed("IT - Unix", false);
        orgStruct.setParent("IT - Unix", "IT");

        orgStruct.addItem("IT - Win");
        orgStruct.setChildrenAllowed("IT - Win", false);
        orgStruct.setParent("IT - Win", "IT");

        orgStruct.addItem("Руководство");
        orgStruct.setChildrenAllowed("Руководство", false);
        orgStruct.setParent("Руководство", "Все подразделения");

        orgStruct.select("HR");
        orgStruct.select("IT - Win");
        orgStruct.select("Руководство");


        setMargin(true);
        setSpacing(true);
        orgStruct.expandItemsRecursively("Все подразделения");
        setStyleName("b");
    }
}
