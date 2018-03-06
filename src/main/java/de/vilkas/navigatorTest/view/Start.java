package de.vilkas.navigatorTest.view;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vilkas on 06/03/2018.
 */
@SpringUI
public class Start extends UI {

    private Navigator navigator;

    @Autowired
    SpringViewProvider viewProvider;

    @Override
    protected void init(final VaadinRequest vaadinRequest) {
        navigator = new Navigator(this, this);
        navigator.addProvider(viewProvider);
        setNavigator(navigator);
        setContent(new Label("main View"));
        navigator.navigateTo("login");

    }
}
