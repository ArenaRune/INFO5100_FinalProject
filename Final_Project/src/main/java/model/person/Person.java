/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.person;

import java.time.LocalDate;
import model.role.Role;

/**
 *
 * @author arenarune
 */
public class Person { 
    private String firstName; 
    private String lastName; 
    private String Address; 
    private String phoneNumber; 
    private String email; 
    private int id; 
    private static int count = 0;
    private Role role;
    
    public Person() { 
        count++; 
        id = count;
    } 

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public String getName() {
        return (firstName + " " + lastName);
    }

    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }
    
    @Override 
    public String toString() { 
        return (firstName + " " + lastName); 
    } 
}
