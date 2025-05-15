/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import model.organization.OrganizationDirectory;

/**
 *
 * @author arenarune
 */
public abstract class Enterprise {
    String name;
    private EnterpriseType enterpriseType;
    OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType {
        ProductionHouse("Production House"),
        DistributionHouse("Distribution house"),
        TheaterChain("Theater Chain"),
        TicketingPlatform("Ticketing Platform");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public Enterprise(String name, EnterpriseType type){
        this.name = name;
        this.enterpriseType=type;
    }
}
