package de.vilkas.navigatorTest.navigation;

import com.vaadin.server.VaadinSession;
import de.vilkas.navigatorTest.model.User;

/**
 * Created by Vilkas on 06/03/2018.
 */
public class UserController {
    private static User getCurrentUser() {
        final VaadinSession session = VaadinSession.getCurrent();
        final Object userObject = session.getAttribute("user");
        if (userObject != null) {
            return (User) userObject;
        }
        return new User(null, "");
    }

    public static boolean canUserNavigateTo(final MyView view) {
        User user = getCurrentUser();
        return user.canNavigateTo(view);
    }
}
