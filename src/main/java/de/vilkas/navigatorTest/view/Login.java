package de.vilkas.navigatorTest.view;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Vilkas on 06/03/2018.
 */
@SpringView(name = "login")
public class Login extends VerticalLayout implements View{
    public Login() {
        TextField name = new TextField("name");
        Button okBtn = new Button("ok", e -> UI.getCurrent().getNavigator().navigateTo("details"));
        addComponents(name,okBtn);
    }
}
