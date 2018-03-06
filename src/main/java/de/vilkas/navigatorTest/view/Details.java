package de.vilkas.navigatorTest.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import de.vilkas.navigatorTest.NavigatorTestApplication;
import de.vilkas.navigatorTest.model.Role;
import de.vilkas.navigatorTest.model.User;
import de.vilkas.navigatorTest.navigation.MyView;
import de.vilkas.navigatorTest.navigation.Navigate;

/**
 * Created by Vilkas on 06/03/2018.
 */
@SpringView(name="details")
public class Details extends VerticalLayout implements View {



    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Button backBtn = new Button("Back to Login", e -> Navigate.to(MyView.LOGIN));
        addComponents(new Label("Details"), backBtn);

    }
}
