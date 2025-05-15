/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import model.role.Role;
import model.theater.Ticket;

/**
 *
 * @author arenarune
 */
public class RefundWorkRequest extends WorkRequest {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }    
    
    @Override
    public String toString() {
        return this.getSender().getName();
    }
}
