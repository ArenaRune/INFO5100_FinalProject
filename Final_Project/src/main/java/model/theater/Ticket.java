/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.theater;

import java.util.ArrayList;

/**
 *
 * @author arenarune
 */
public class Ticket {
    private Show show;
    private ArrayList<Seat> seats;
    private double price;

    public Ticket(Show show) {
        this.show = show;
        seats = new ArrayList<Seat>();
    }

    public Show getShow() {
        return show;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.show.getMovie().getName();
    }
}
