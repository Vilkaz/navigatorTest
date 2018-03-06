package de.vilkas.navigatorTest.navigation;

import de.vilkas.navigatorTest.model.Role;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by Vilkas on 06/03/2018.
 */
public enum MyView {
    LOGIN("login"),
    DETAILS("details", Role.STUDENT);

    private String name;
    private Collection<Role> forbiddenRoles;

    MyView(final String name, final Role... forbiddenRoles) {
        this.name = name;
        this.forbiddenRoles = Arrays.stream(forbiddenRoles).collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public Collection<Role> getForbiddenRoles() {
        return forbiddenRoles;
    }
}
