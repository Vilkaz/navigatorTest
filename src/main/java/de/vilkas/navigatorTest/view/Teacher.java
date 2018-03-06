package de.vilkas.navigatorTest.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import de.vilkas.navigatorTest.navigation.MyView;
import de.vilkas.navigatorTest.navigation.Navigate;

/**
 * Created by Vilkas on 06/03/2018.
 */
@SpringView(name="teacher")
public class Teacher extends VerticalLayout implements View {



    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Button backBtn = new Button("Back to Login", e -> Navigate.to(MyView.LOGIN));
        addComponents(new Label("zurück zum login"), backBtn);

    }
}
