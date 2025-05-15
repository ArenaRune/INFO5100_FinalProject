/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import model.movie.Movie;
import model.person.Person;
import model.theater.Ticket;

/**
 *
 * @author arenarune
 */
public class CustomerRole extends Role{
    private ArrayList<Ticket> tickets;
    
    public CustomerRole(Person person) {
        super(person);
        tickets = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    
    @Override
    public String toString() {
        return this.person.getName();
    }
}
