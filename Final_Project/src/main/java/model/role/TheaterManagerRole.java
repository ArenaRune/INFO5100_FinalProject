/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import java.util.ArrayList;
import model.movie.Movie;
import model.person.Person;
import model.theater.Theater;

/**
 *
 * @author arenarune
 */
public class TheaterManagerRole extends Role {
    private Theater theater;
    
    public TheaterManagerRole(Person person) {
        super(person);
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
    
    @Override
    public String toString() {
        return this.person.getName();
    }

}
