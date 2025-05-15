/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.movie.Movie;
import model.organization.DistributorOperationsOrganization;
import model.organization.Organization;
import model.organization.OrganizationDirectory;

/**
 *
 * @author arenarune
 */
public class DistributionCompany extends Enterprise {
    private ArrayList<Movie> movieList;
    private DistributorOperationsOrganization distributorOperationsOrganization;
    
    public DistributionCompany(String name) {
        super(name, EnterpriseType.DistributionHouse);
        organizationDirectory = new OrganizationDirectory();
        movieList = new ArrayList<Movie>();
        distributorOperationsOrganization = (DistributorOperationsOrganization) organizationDirectory.createOrganization(Organization.Type.Distributor);
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public DistributorOperationsOrganization getDistributorOperationsOrganization() {
        return distributorOperationsOrganization;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    @Override
    public String toString() {
        return name;
    }
}
