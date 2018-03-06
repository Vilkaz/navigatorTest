package de.vilkas.navigatorTest.model;

import de.vilkas.navigatorTest.navigation.MyView;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vilkas on 06/03/2018.
 */
public class UserTest{


    @Test
    public void viewAccess() {
        User user = new User(1l, "studi", Role.STUDENT);
        Assert.assertFalse(user.canNavigateTo(MyView.DETAILS));
        Assert.assertTrue(user.canNavigateTo(MyView.LOGIN));
    }
}
