package de.vilkas.navigatorTest.model;

import de.vilkas.navigatorTest.navigation.MyView;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by Vilkas on 06/03/2018.
 */
public class User {
    private Long id;
    private String name;
    private Collection<Role> roles;

    public User(final Long id, final String name, final Role... roles) {
        this.id = id;
        this.name = name;
        this.roles = Arrays.stream(roles).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Collection<Role> roles) {
        this.roles = roles;
    }

    public String getDetails() {
        return "Name:" + name + roles;
    }

    public boolean canNavigateTo(final MyView view) {
        return !view
                .getForbiddenRoles()
                .stream()
                .anyMatch(fr -> roles.contains(fr));
    }
}
