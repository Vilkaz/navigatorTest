package de.vilkas.navigatorTest.navigation;

import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

/**
 * Created by Vilkas on 06/03/2018.
 */
public class Navigate {

    public static void to(MyView view) {
        if (!view.isClosed()) {
            navigateToTheView(view);
        } else {
            if (UserController.canUserNavigateTo(view)) {
                navigateToTheView(view);
            } else {
                Notification.show("Sie haben keine Berechtigung für die Seite:" + view.getName());
            }
        }
    }

    private static void navigateToTheView(final MyView view) {
        UI.getCurrent().getNavigator().navigateTo(view.getName());
    }
}
