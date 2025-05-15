/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import java.util.ArrayList;

/**
 *
 * @author navyaravuri
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workQueue;
    
    public WorkQueue() {
        workQueue = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkQueue() {
        return workQueue;
    }
}
