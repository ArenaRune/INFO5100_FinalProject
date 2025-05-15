/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.theater;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import model.enterprise.TheaterChain;
import model.movie.Movie;
import model.role.TheaterManagerRole;

/**
 *
 * @author arenarune
 */
public class Theater {
    private String name;
    private TheaterChain theaterChain;
    private ArrayList<Screen> screens;
    private ArrayList<Movie> movieList;
    private HashMap<Movie,Double> priceList;
    private TheaterManagerRole theaterManager;
    private HashMap<Movie,ArrayList<Show>> movieShows;
    private ArrayList<Show> shows;
    private HashMap<Movie,Double> revenueList;
    private HashMap<Movie,Integer> ticketsSold;

    public Theater() {
        screens = new ArrayList<Screen>();
        priceList = new HashMap<Movie, Double>();
        movieList = new ArrayList<Movie>();
        revenueList = new HashMap<Movie, Double>();
        shows = new ArrayList<Show>();
        movieShows = new HashMap<Movie,ArrayList<Show>>();
        ticketsSold = new HashMap<Movie,Integer>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TheaterChain getTheaterChain() {
        return theaterChain;
    }

    public void setTheaterChain(TheaterChain theaterChain) {
        this.theaterChain = theaterChain;
    }

    public ArrayList<Screen> getScreens() {
        return screens;
    }

    public void setScreens(ArrayList<Screen> screens) {
        this.screens = screens;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public HashMap<Movie, Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(HashMap<Movie, Double> priceList) {
        this.priceList = priceList;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public TheaterManagerRole getTheaterManager() {
        return theaterManager;
    }

    public void setTheaterManager(TheaterManagerRole theaterManager) {
        this.theaterManager = theaterManager;
    }

    public HashMap<Movie, ArrayList<Show>> getMovieShows() {
        return movieShows;
    }

    public void setMovieShows(HashMap<Movie, ArrayList<Show>> movieShows) {
        this.movieShows = movieShows;
    }

    public HashMap<Movie, Double> getRevenueList() {
        return revenueList;
    }


    public HashMap<Movie, Integer> getTicketsSold() {
        return ticketsSold;
    }
    
    public Screen newScreen(String name) {
        Screen screen = new Screen(name);
        screens.add(screen);
        return screen;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
