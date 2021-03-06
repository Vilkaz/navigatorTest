package de.vilkas.navigatorTest.view;

import com.vaadin.navigator.View;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import de.vilkas.navigatorTest.model.Role;
import de.vilkas.navigatorTest.model.User;
import de.vilkas.navigatorTest.navigation.MyView;
import de.vilkas.navigatorTest.navigation.Navigate;

/**
 * Created by Vilkas on 06/03/2018.
 */
@SpringView(name = "login")
public class Login extends VerticalLayout implements View {
    TextField name;
    ComboBox<Role> roles;

    public Login() {
        name = new TextField("name");
        roles = new ComboBox<>();
        roles.setItems(Role.values());
        roles.setEmptySelectionAllowed(false);
        Button okBtn = new Button("zum Lehrerbereich", e -> loginUser());
        addComponents(name, roles, okBtn);
    }

    private void loginUser() {
        final VaadinSession session = VaadinSession.getCurrent();
        session.setAttribute("user", new User(1l, name.getValue(),roles.getValue()));
        Navigate.to(MyView.TEACHER);
    }
}
