/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import model.network.Network;
import model.organization.AdminOrganization;
import model.organization.CustomerOrganization;
import model.person.PersonDirectory;
import model.useraccount.UserAccount;
import model.useraccount.UserAccountDirectory;

/**
 *
 * @author arenarune
 */
public class EcoSystem {
    private ArrayList<Network> networkList;
    private HashMap<Network, PersonDirectory> allPersons;
    private HashMap<Network, UserAccountDirectory> allAccounts;
    private UserAccountDirectory customerDirectory;
    private UserAccountDirectory adminDirectory;
    private PersonDirectory personDirectory;
    private AdminOrganization adminOrganization;
    private CustomerOrganization customerOrganization;
    private static EcoSystem ecoSystem;
    
    public EcoSystem() {
        networkList = new ArrayList<Network>();
        allPersons = new HashMap<Network, PersonDirectory>();
        allAccounts = new HashMap<Network, UserAccountDirectory>();
        customerDirectory = new UserAccountDirectory();
        adminDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
        customerOrganization = new CustomerOrganization();
        adminOrganization = new AdminOrganization();
    }
    
    public static EcoSystem getInstance() {
        if(ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    
    public Network newNetwork(String name) {
        Network network = new Network(name);
        networkList.add(network);
        allAccounts.put(network, network.getUserAccountDirectory());
        allPersons.put(network, network.getPersonDirectory());
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public HashMap<Network, UserAccountDirectory> getAllAccounts() {
        return allAccounts;
    }

    public UserAccountDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public UserAccountDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public AdminOrganization getAdminOrganization() {
        return adminOrganization;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public CustomerOrganization getCustomerOrganization() {
        return customerOrganization;
    }
    
    public boolean isUnique(String value) {
        for(Network network : networkList) {
            UserAccountDirectory uad = allAccounts.get(network);
            uad.getUserAccountList().addAll(customerDirectory.getUserAccountList());
            uad.getUserAccountList().addAll(adminDirectory.getUserAccountList());
            for (UserAccount ua : uad.getUserAccountList()) {
                if(value.equals(ua.getUsername())) {
                    return false;
                }
            }    
            
        }
        return true;
    }
}
