package de.vilkas.navigatorTest.navigation;

import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import de.vilkas.navigatorTest.model.User;

/**
 * Created by Vilkas on 06/03/2018.
 */
public class Navigate {

    public static void to(MyView view) {
        final VaadinSession session = VaadinSession.getCurrent();
        final Object userObject = session.getAttribute("user");
        if (userObject != null) {
            User user = (User) userObject;
            if (user.canNavigateTo(view)) {
                UI.getCurrent().getNavigator().navigateTo(view.getName());
            } else {
                Notification.show("Sie haben keine Berechtigung für die Seite:" + view.getName());
            }
        }


    }
}
