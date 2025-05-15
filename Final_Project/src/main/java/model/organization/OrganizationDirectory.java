/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.organization.Organization.Type;

/**
 *
 * @author arenarune
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationDirectory;
    
    public OrganizationDirectory() {
        organizationDirectory = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if(type.getValue().equals(Type.Cast.getValue())){
            organization = new CastOrganization();
        }
        else if(type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
        }
        else if(type.getValue().equals(Type.CustomerSupport.getValue())){
            organization = new CustomerSupportOrganization();
        }
        else if(type.getValue().equals(Type.Director.getValue())){
            organization = new DirectorOrganization();
        }
        else if(type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributorOperationsOrganization();
        }
        else if(type.getValue().equals(Type.Producer.getValue())){
            organization = new ProducerOrganization();
        }
        else if(type.getValue().equals(Type.ScreenWriter.getValue())){
            organization = new ScreenWriterOrganization();
        }
        else if(type.getValue().equals(Type.TheaterManager.getValue())){
            organization = new ScreeningOperationsOrganization();
        }
        organizationDirectory.add(organization);
        return organization;
    }
    
    
}
