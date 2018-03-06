package de.vilkas.navigatorTest.navigation;

import de.vilkas.navigatorTest.model.Role;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by Vilkas on 06/03/2018.
 */
public enum MyView {
    LOGIN("login", false, Role.values()),
    TEACHER("teacher", true, Role.ADMIN, Role.TEACHER);

    private String name;
    private Collection<Role> allowedRoles;

    MyView(final String name, final boolean closed, final Role... allowedRoles) {
        this.name = name;
        this.closed = closed;
        this.allowedRoles = Arrays.stream(allowedRoles).collect(Collectors.toList());
    }

    private boolean closed;

    public String getName() {
        return name;
    }

    public boolean isClosed() {
        return closed;
    }

    public Collection<Role> getAllowedRoles() {
        return allowedRoles;
    }
}
