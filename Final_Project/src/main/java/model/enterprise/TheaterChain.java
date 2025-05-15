/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.organization.Organization;
import model.organization.OrganizationDirectory;
import model.organization.ScreeningOperationsOrganization;
import model.role.TheaterManagerRole;
import model.theater.Theater;

/**
 *
 * @author arenarune
 */
public class TheaterChain extends Enterprise {
    private ArrayList<Theater> theaterList;
    private ScreeningOperationsOrganization screeningOperationsOrganization;
    
    public TheaterChain(String name) {
        super(name, EnterpriseType.TheaterChain);
        organizationDirectory = new OrganizationDirectory();
        screeningOperationsOrganization = (ScreeningOperationsOrganization) organizationDirectory.createOrganization(Organization.Type.TheaterManager);
        theaterList = new ArrayList<Theater>();
    }
    
    public ScreeningOperationsOrganization getScreeningOperationsOrganization(){
        return screeningOperationsOrganization;
    }
    
    public Theater newTheater(){
        Theater theater = new Theater();
        theaterList.add(theater);
        return theater;
    }

    public ArrayList<Theater> getTheaterList() {
        return theaterList;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
