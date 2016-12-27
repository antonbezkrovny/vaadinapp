package org.test.Widgets.Top;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.*;

import java.io.File;

/**
 * Created by Anton.Bezkrovnyy on 21.12.2016.
 */
public class RightPanel extends HorizontalLayout {

    RightPanel (String name, String pathToAvatar, String settingsCaption){
        String basepath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
        FileResource resource = new FileResource(new File(basepath +
                pathToAvatar));
        setDefaultComponentAlignment(Alignment.MIDDLE_RIGHT);
        Label userName = new Label(name);
        Button options = new Button();
        Image ava = new Image();
        ava.setSource(resource);
        addComponents(ava, userName, options);
        setMargin(true);
        options.addStyleName("tiny");
        options.setCaption(settingsCaption);
        setSpacing(true);
        setStyleName("b");

    }
}
