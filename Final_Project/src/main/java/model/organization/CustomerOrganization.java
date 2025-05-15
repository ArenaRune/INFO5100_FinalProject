/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.CustomerRole;

/**
 *
 * @author arenarune
 */
public class CustomerOrganization extends Organization {
    private ArrayList<CustomerRole> customerRoles;
    
    public CustomerOrganization() {
        super(Type.Customer.getValue());
        customerRoles = new ArrayList<CustomerRole>();
    }

    public ArrayList<CustomerRole> getCustomerRoles() {
        return customerRoles;
    }
    public CustomerRole newCustomer(Person person) {
        CustomerRole customerRole = new CustomerRole(person);
        customerRoles.add(customerRole);
        return customerRole;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Customer";
    }
}
