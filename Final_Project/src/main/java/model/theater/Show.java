/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.theater;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import model.movie.Movie;

/**
 *
 * @author navyaravuri
 */
public class Show {
    private Movie movie;
    private Theater theater;
    private Screen screen;
    private LocalDate date;
    private ArrayList<Ticket> tickets;
    private double ticketPrice;
    private String showType;
    private ArrayList<Seat> seats;
    
    public Show(Movie movie, Screen screen, LocalDate date, String showType, Theater theater) {
        this.movie = movie;
        this.screen = screen;
        this.date = date;
        this.showType = showType;
        this.seats = screen.generateSeats();
        this.tickets = new ArrayList<>();
        this.theater = theater;
        for (Seat s : seats) {
            s.setShow(this);
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public Theater getTheater() {
        return theater;
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public String getShowType() {
        return showType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
    
    @Override
    public String toString() {
        return movie.getName();
    }
}
