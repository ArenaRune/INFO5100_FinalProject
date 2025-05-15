/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.ScreenWriterRole;

/**
 *
 * @author arenarune
 */
public class ScreenWriterOrganization extends Organization {
    private ArrayList<ScreenWriterRole> screenWriterRoles;
    
    public ScreenWriterOrganization() {
        super(Type.ScreenWriter.getValue());
        screenWriterRoles = new ArrayList<ScreenWriterRole>();
    }
    
    public ScreenWriterRole newScreenWriter(Person person) {
        ScreenWriterRole screenWriter = new ScreenWriterRole(person);
        screenWriterRoles.add(screenWriter);
        return screenWriter;
    }

    public ArrayList<ScreenWriterRole> getScreenWriterRoles() {
        return screenWriterRoles;
    }
    @Override
    public String toString() {
        return "Screen Writer";
    }
}
