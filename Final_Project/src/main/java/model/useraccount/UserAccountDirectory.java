/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.useraccount;

import java.util.ArrayList;
import model.person.Person;
import model.role.Role;

/**
 *
 * @author arenarune
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccount newUserAccount(Person person, String email, String username, String password, Role role) {
        UserAccount userAccount = new UserAccount(person, email, username, password, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }
}
