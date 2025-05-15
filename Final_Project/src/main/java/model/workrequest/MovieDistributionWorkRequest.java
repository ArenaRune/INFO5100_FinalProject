/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import java.util.HashMap;
import model.movie.Movie;
import model.role.DistributorRole;
import model.role.Role;

/**
 *
 * @author navyaravuri
 */
public class MovieDistributionWorkRequest extends WorkRequest{
    private Role receiver;
    private double minimumBid;
    private Movie movie;

    public Role getReceiver() {
        return receiver;
    }

    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    public double getMinimumBid() {
        return minimumBid;
    }

    public void setMinimumBid(double minimumBid) {
        this.minimumBid = minimumBid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    @Override
    public String toString() {
        return movie.getName();
    }
}
