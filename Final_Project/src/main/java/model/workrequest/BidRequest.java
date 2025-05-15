/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import model.movie.Movie;
import model.role.Role;

/**
 *
 * @author praneethreddy
 */
public class BidRequest extends WorkRequest {
    private Role receiver;
    private double bidAmount;
    private Movie movie;

    public double getBidAmount() {
        return bidAmount;
    }

    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }
    
    @Override
    public String toString() {
        return sender.getName();
    }
}
