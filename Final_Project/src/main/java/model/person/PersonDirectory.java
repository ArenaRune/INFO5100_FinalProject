/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.person;

import java.util.ArrayList;

/**
 *
 * @author arenarune
 */
public class PersonDirectory { 
    private ArrayList<Person> personDirectory; 
    
    public PersonDirectory() { 
        personDirectory = new ArrayList<Person>(); 
    } 
    
    public ArrayList<Person> getPersonDirectory() { 
        return personDirectory; 
    } 
    
    public Person newPerson() { 
        Person person = new Person(); 
        personDirectory.add(person); 
        return person; 
    } 
}

