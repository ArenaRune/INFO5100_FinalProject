/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.CustomerSupportRole;

/**
 *
 * @author arenarune
 */
public class CustomerSupportOrganization extends Organization {
    private ArrayList<CustomerSupportRole> customerSupportRoles;
    
    public CustomerSupportOrganization() {
        super(Type.CustomerSupport.getValue());
        customerSupportRoles = new ArrayList<CustomerSupportRole>();
    }
    public CustomerSupportRole newCustomerSupport(Person person) {
        CustomerSupportRole customerSupportRole = new CustomerSupportRole(person);
        customerSupportRoles.add(customerSupportRole);
        return customerSupportRole;
    }

    public ArrayList<CustomerSupportRole> getCustomerSupportRoles() {
        return customerSupportRoles;
    }
    @Override
    public String toString() {
        return "Customer Support";
    }
}
