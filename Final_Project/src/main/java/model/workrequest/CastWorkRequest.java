/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import model.role.Role;

/**
 *
 * @author navyaravuri
 */
public class CastWorkRequest extends WorkRequest {
    private Role receiver;
    private boolean decision;
    private double salary;
    private String movieName;
    private ProducerWorkRequest pwr;
    
    public Role getReceiver() {
        return receiver;
    }

    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ProducerWorkRequest getPwr() {
        return pwr;
    }

    public void setPwr(ProducerWorkRequest pwr) {
        this.pwr = pwr;
    }
    
    @Override
    public String toString(){
        return movieName;
    }
}
