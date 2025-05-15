/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import model.organization.CustomerSupportOrganization;
import model.organization.Organization;
import model.organization.OrganizationDirectory;

/**
 *
 * @author arenarune
 */
public class TicketingPlatform extends Enterprise {
    private CustomerSupportOrganization customerSupportOrganization;
    
    public TicketingPlatform(String name) {
        super(name, EnterpriseType.TicketingPlatform);
        organizationDirectory = new OrganizationDirectory();
        customerSupportOrganization = (CustomerSupportOrganization) organizationDirectory.createOrganization(Organization.Type.CustomerSupport);
    }

    public CustomerSupportOrganization getCustomerSupportOrganization() {
        return customerSupportOrganization;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
