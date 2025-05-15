/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import java.util.ArrayList;
import java.util.HashMap;
import model.role.Role;

/**
 *
 * @author arenarune
 */
public class ProducerWorkRequest extends WorkRequest{
    private String movieName;
    private WorkQueue movieQueue;
    private DirectorWorkRequest directorWorkRequest;
    private ArrayList<CastWorkRequest> castWorkRequests;
    private ScreenWriterWorkRequest screenWriterWorkRequest;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ProducerWorkRequest() {
        castWorkRequests = new ArrayList<CastWorkRequest>();
        movieQueue = new WorkQueue();
        status = "pending";
    }

    public DirectorWorkRequest getDirectorWorkRequest() {
        return directorWorkRequest;
    }

    public void setDirectorWorkRequest(DirectorWorkRequest directorWorkRequest) {
        this.directorWorkRequest = directorWorkRequest;
    }

    public ArrayList<CastWorkRequest> getCastWorkRequests() {
        return castWorkRequests;
    }

    public void setCastWorkRequests(ArrayList<CastWorkRequest> castWorkRequests) {
        this.castWorkRequests = castWorkRequests;
    }

    public ScreenWriterWorkRequest getScreenWriterWorkRequest() {
        return screenWriterWorkRequest;
    }

    public void setScreenWriterWorkRequest(ScreenWriterWorkRequest screenWriterWorkRequest) {
        this.screenWriterWorkRequest = screenWriterWorkRequest;
    }
    
    public void setMovieQueue() {
        ArrayList<WorkRequest> queue = movieQueue.getWorkQueue();
        queue.add(directorWorkRequest);
        queue.add(screenWriterWorkRequest);
        for(CastWorkRequest cwr: castWorkRequests) {
            queue.add(cwr);
        }
    }
    
    public WorkQueue getMovieQueue() {
        return movieQueue;
    }
    
    public void movieStatus() {
        for (CastWorkRequest cwr: castWorkRequests) {
            if (cwr.getStatus().equals("reject")){
                status = "reject";
                return;
            }
        }
        if (directorWorkRequest.getStatus().equals("reject")) {
            status = "reject";
            return;
        }
        if (screenWriterWorkRequest.getStatus().equals("reject")) {
            status = "reject";
            return;
        }
    }
    
    @Override
    public String toString() {
        return movieName;
    }

    public void checkStatus() {
        for (CastWorkRequest cwr: castWorkRequests) {
            if (!cwr.getStatus().equals("accept")){
                return;
            }
        }
        if (!directorWorkRequest.getStatus().equals("accept")) {
            return;
        }
        if (!screenWriterWorkRequest.getStatus().equals("accept")) {
            return;
        }
        status = "accept";
    }
}
