/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import java.util.ArrayList;
import java.util.HashMap;
import model.movie.Movie;
import model.person.Person;

/**
 *
 * @author arenarune
 */
public class DistributorRole extends Role {
    private ArrayList<Movie> movieList;
    private HashMap<Movie,Double> cost;
    
    public DistributorRole(Person person) {
        super(person);
        cost = new HashMap<Movie,Double>();
        movieList = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public HashMap<Movie, Double> getCost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return this.person.getName();
    }

}
