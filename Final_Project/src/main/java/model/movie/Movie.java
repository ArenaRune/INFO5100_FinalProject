/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.movie;

import java.time.LocalDate;
import java.util.ArrayList;
import model.role.CastRole;
import model.role.DirectorRole;
import model.role.ProducerRole;
import model.role.ScreenWriterRole;

/**
 *
 * @author arenarune
 */
public class Movie {
    private String name;
    private LocalDate date;
    private double budget = 0;
    private double revenue = 0;
    private int ticketCount = 0;
    private DirectorRole director;
    private ProducerRole producer;
    private ArrayList<CastRole> cast;
    private ScreenWriterRole screenWriter;

    public Movie(String name, DirectorRole director, ProducerRole producer, ArrayList<CastRole> cast, ScreenWriterRole screenWriter) {
        this.name = name;
        this.director = director;
        this.producer = producer;
        this.cast = cast;
        this.screenWriter = screenWriter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
