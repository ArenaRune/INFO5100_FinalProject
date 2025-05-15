/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.DirectorRole;

/**
 *
 * @author arenarune
 */
public class DirectorOrganization extends Organization {
    private ArrayList<DirectorRole> directorRoles;
    
    public DirectorOrganization() {
        super(Type.Director.getValue());
        directorRoles = new ArrayList<DirectorRole>();
    }

    public DirectorRole newDirector(Person person) {
        DirectorRole directorRole = new DirectorRole(person);
        directorRoles.add(directorRole);
        return directorRole;
    }
    
    public ArrayList<DirectorRole> getDirectorRoles() {
        return directorRoles;
    }
    @Override
    public String toString() {
        return "Director";
    }
}
