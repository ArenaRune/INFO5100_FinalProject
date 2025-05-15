/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.CastRole;

/**
 *
 * @author arenarune
 */
public class CastOrganization extends Organization {
    private ArrayList<CastRole> castRoles;
    
    public CastOrganization() {
        super(Type.Cast.getValue());
        castRoles = new ArrayList<CastRole>();
    }
    public CastRole newCast(Person person) {
        CastRole cast = new CastRole(person);
        castRoles.add(cast);
        return cast;
    }

    public ArrayList<CastRole> getCastRoles() {
        return castRoles;
    }
    @Override
    public String toString() {
        return "Cast";
    }
}
