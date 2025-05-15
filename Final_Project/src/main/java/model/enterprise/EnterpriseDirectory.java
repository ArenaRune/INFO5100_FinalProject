/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.enterprise.Enterprise.EnterpriseType;

/**
 *
 * @author arenarune
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    public Enterprise newEnterprise(String name, EnterpriseType type) {
        Enterprise enterprise = null;
        if((type.getValue().equals(EnterpriseType.ProductionHouse.getValue()))) {
            enterprise = new ProductionHouse(name);
        }
        else if((type.getValue().equals(EnterpriseType.DistributionHouse.getValue()))) {
            enterprise = new DistributionCompany(name);
        }
        else if((type.getValue().equals(EnterpriseType.TheaterChain.getValue()))) {
            enterprise = new TheaterChain(name);
        }
        else if((type.getValue().equals(EnterpriseType.TicketingPlatform.getValue()))) {
            enterprise = new TicketingPlatform(name);
        }
        enterpriseList.add(enterprise);
        return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise findEnterpriseByType(EnterpriseType type) {
        Enterprise enterprise = null;
        for (Enterprise e : enterpriseList) {
            if (type.equals(e.getEnterpriseType())) enterprise = e;
        }
        return enterprise;
    }
}
