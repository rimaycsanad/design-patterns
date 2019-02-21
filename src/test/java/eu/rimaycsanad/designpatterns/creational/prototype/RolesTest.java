package eu.rimaycsanad.designpatterns.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class RolesTest {

    @Test
    public void getRoles() {
        Roles tmp, tmp1, roles = new Roles();
        roles.fillRoles();
        System.out.println("roles: "+roles.getRoles());
        try {


        tmp = (Roles)roles.clone();
        tmp.getRoles().add("DIRECTOR");
        System.out.println("tmp roles: "+tmp.getRoles());

        tmp1 = (Roles)roles.clone();
        tmp1.getRoles().remove(0);
        System.out.println("tmp1 roles: "+tmp1.getRoles());
        } catch (CloneNotSupportedException e) {

        }
    }


}