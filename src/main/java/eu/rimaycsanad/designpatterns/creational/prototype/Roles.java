package eu.rimaycsanad.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Roles implements Cloneable {

    private List<String> roles;

    public Roles() {
        roles = new ArrayList<>();
    }

    public Roles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getRoles() {
        return roles;
    }

    public List<String> fillRoles() {
        //Slow database query
        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("GUEST");
        roles.add("DEPLOYER");

        return roles;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tmpRoles = new ArrayList<>();
        for(String role : this.roles) {
            tmpRoles.add(role);
        }
        return new Roles(tmpRoles);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roles=" + roles +
                '}';
    }
}
