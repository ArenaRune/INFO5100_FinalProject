/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import java.util.ArrayList;
import java.util.HashMap;
import model.movie.Movie;
import model.person.Person;
import model.workrequest.BidRequest;
import model.workrequest.CastWorkRequest;
import model.workrequest.ProducerWorkRequest;
import model.workrequest.WorkRequest;

/**
 *
 * @author arenarune
 */
public class ProducerRole extends Role{
    private ArrayList<Movie> movieList;
    private ArrayList<Movie> moviesForBid;
    private ArrayList<Movie> moviesNotDistributed;
    private ArrayList<ProducerWorkRequest> movieQueue;
    private HashMap<Movie,ArrayList<BidRequest>> bidQueue;
    
    
    public ProducerRole(Person person) {
        super(person);
        movieQueue = new ArrayList<ProducerWorkRequest>();
        movieList = new ArrayList<Movie>();
        moviesForBid = new ArrayList<Movie>();
        moviesNotDistributed = new ArrayList<Movie>();        
        bidQueue = new HashMap<Movie,ArrayList<BidRequest>>();
    }
    
    public void movieStatus() {
        for (ProducerWorkRequest pwr : movieQueue) {
            pwr.movieStatus();
            pwr.checkStatus();
            if(pwr.getStatus().equals("reject")) {
                movieQueue.remove(pwr);
                break;
            }
        }
    }
    
    public Movie newMovie(String name, DirectorRole director, ArrayList<CastRole> cast, ScreenWriterRole screenWriter){
        Movie movie = new Movie(name, director, this, cast, screenWriter);
        movieList.add(movie);
        return movie;
    }
    
    public ArrayList<ProducerWorkRequest> getMovieQueue() {
        return movieQueue;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
    
    public void removeMovieRequest(ProducerWorkRequest pwr) {
        pwr.getDirectorWorkRequest().getReceiver().getWorkQueue().getWorkQueue().remove(pwr.getDirectorWorkRequest());
        pwr.getScreenWriterWorkRequest().getReceiver().getWorkQueue().getWorkQueue().remove(pwr.getScreenWriterWorkRequest());
        for(CastWorkRequest cwr: pwr.getCastWorkRequests()) {
            cwr.getReceiver().workQueue.getWorkQueue().remove(cwr);
        }
        movieQueue.remove(pwr);
    }

    public ArrayList<Movie> getMoviesForBid() {
        return moviesForBid;
    }

    public ArrayList<Movie> getMoviesNotDistributed() {
        return moviesNotDistributed;
    }

    public HashMap<Movie, ArrayList<BidRequest>> getBidQueue() {
        return bidQueue;
    }
     
    @Override
    public String toString() {
        return this.person.getName();
    }

}
