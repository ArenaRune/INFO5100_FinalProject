/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.DistributorRole;

/**
 *
 * @author arenarune
 */
public class DistributorOperationsOrganization extends Organization {
    private ArrayList<DistributorRole> distributorRoles;
    
    public DistributorOperationsOrganization() {
        super(Type.Distributor.getValue());
        distributorRoles = new ArrayList<DistributorRole>();
    }
    
    public DistributorRole newDistributor(Person person) {
        DistributorRole distributor = new DistributorRole(person);
        distributorRoles.add(distributor);
        return distributor;
    }

    public ArrayList<DistributorRole> getDistributorRoles() {
        return distributorRoles;
    }
    @Override
    public String toString() {
        return "Distributor";
    }
}
