/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.enterprise.Enterprise.EnterpriseType;
import model.movie.Movie;
import model.organization.CastOrganization;
import model.organization.DirectorOrganization;
import model.organization.Organization;
import model.organization.OrganizationDirectory;
import model.organization.ProducerOrganization;
import model.organization.ScreenWriterOrganization;

/**
 *
 * @author arenarune
 */
public class ProductionHouse extends Enterprise {
    private ArrayList<Movie> movieList;
    private DirectorOrganization directorOrganization;
    private ProducerOrganization producerOrganization;
    private ScreenWriterOrganization screenWriterOrganization;
    private CastOrganization castOrganization;
    
    public ProductionHouse(String name) {
        super(name, EnterpriseType.ProductionHouse);
        organizationDirectory = new OrganizationDirectory();
        directorOrganization = (DirectorOrganization) organizationDirectory.createOrganization(Organization.Type.Director);
        producerOrganization = (ProducerOrganization) organizationDirectory.createOrganization(Organization.Type.Producer);
        screenWriterOrganization = (ScreenWriterOrganization) organizationDirectory.createOrganization(Organization.Type.ScreenWriter);
        castOrganization = (CastOrganization) organizationDirectory.createOrganization(Organization.Type.Cast);
        movieList = new ArrayList<Movie>();
    }

    public DirectorOrganization getDirectorOrganization() {
        return directorOrganization;
    }

    public ProducerOrganization getProducerOrganization() {
        return producerOrganization;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public ScreenWriterOrganization getScreenWriterOrganization() {
        return screenWriterOrganization;
    }

    public CastOrganization getCastOrganization() {
        return castOrganization;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    @Override
    public String toString() {
        return name;
    }
}
