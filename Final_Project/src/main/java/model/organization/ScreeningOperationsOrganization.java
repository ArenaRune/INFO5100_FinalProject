/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.TheaterManagerRole;

/**
 *
 * @author arenarune
 */
public class ScreeningOperationsOrganization extends Organization {
    private ArrayList<TheaterManagerRole> theaterManagerRoles;
    
    public ScreeningOperationsOrganization() {
        super(Type.TheaterManager.getValue());
        theaterManagerRoles = new ArrayList<TheaterManagerRole>();
    }
    
    public TheaterManagerRole newTheaterManager(Person person) {
        TheaterManagerRole theaterManager = new TheaterManagerRole(person);
        theaterManagerRoles.add(theaterManager);
        return theaterManager;
    }

    public ArrayList<TheaterManagerRole> getTheaterManagerRoles() {
        return theaterManagerRoles;
    }
    @Override
    public String toString() {
        return "Theater Manager";
    }
}
