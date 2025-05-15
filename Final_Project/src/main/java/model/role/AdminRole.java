/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import model.person.Person;

/**
 *
 * @author navyaravuri
 */
public class AdminRole extends Role {
    
    public AdminRole(Person person) {
        super(person);
    }
    
    @Override
    public String toString() {
        return person.getName();
    }
}
