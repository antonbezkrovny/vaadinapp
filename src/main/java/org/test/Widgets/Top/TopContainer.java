package org.test.Widgets.Top;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class TopContainer extends HorizontalLayout {

    LeftPanel leftPanel = new LeftPanel("Contoso Security Awareness Center");
    RightPanel rightPanel = new RightPanel("John.Doe@contoso.com", "/images/user.jpg", "Настройки");

    public TopContainer() {
        setSizeFull();
//        setDefaultComponentAlignment();
        addComponents(leftPanel, rightPanel);
        setComponentAlignment(leftPanel, Alignment.MIDDLE_LEFT);
        setComponentAlignment(rightPanel, Alignment.MIDDLE_RIGHT);
        setStyleName("b");

    }
}
