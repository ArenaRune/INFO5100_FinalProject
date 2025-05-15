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
public class CastRole extends Role{
    private ArrayList<Movie> movieList;
    private HashMap<Movie,Double> Salary;
    
    public CastRole(Person person) {
        super(person);
        Salary = new HashMap<Movie,Double>();
        movieList = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public HashMap<Movie, Double> getSalary() {
        return Salary;
    }
    
    @Override
    public String toString() {
        return person.getName();
    }

}
