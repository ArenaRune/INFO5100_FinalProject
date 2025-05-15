/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.network;

import java.util.ArrayList;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseDirectory;
import model.organization.Organization;
import model.organization.OrganizationDirectory;
import model.person.PersonDirectory;
import model.useraccount.UserAccountDirectory;

/**
 *
 * @author arenarune
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    
    public Network(String name) {
        this.name = name;
        enterpriseDirectory = new EnterpriseDirectory();
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
