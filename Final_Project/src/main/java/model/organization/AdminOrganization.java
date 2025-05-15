/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.AdminRole;

/**
 *
 * @author praneethreddy
 */
public class AdminOrganization extends Organization {
    private ArrayList<AdminRole> adminRoles;
    
    public AdminOrganization() {
        super(Type.Admin.getValue());
        adminRoles = new ArrayList<AdminRole>();
    }

    public ArrayList<AdminRole> getAdminRoles() {
        return adminRoles;
    }

    public AdminRole newAdmin(Person person) {
        AdminRole adminRole = new AdminRole(person);
        adminRoles.add(adminRole);
        return adminRole;
    }
    @Override
    public String toString() {
        return "Admin";
    }
}
