/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.useraccount;

import model.person.Person;
import model.role.Role;

/**
 *
 * @author arenarune
 */
public class UserAccount {
    Person person;
    String email;
    String username;
    String password;
    Role role;
    String userID;
    private static int counter = 1;

    public UserAccount(Person person, String email, String username, String password, Role role) {
        this.person = person;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        StringBuffer sb = new StringBuffer();
        sb.append("UserID:");
        sb.append(counter);
        userID = sb.toString();
        counter++;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Person getPerson() {
        return person;
    }

    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getUserID() {
        return userID;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public static void setCounter(int counter) {
        UserAccount.counter = counter;
    }

    @Override
    public String toString() {
        return username;
    }
}
