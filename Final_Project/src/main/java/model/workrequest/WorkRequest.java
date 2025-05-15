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
public abstract class WorkRequest {
    Role sender;
    String status;
    
    public Role getSender() {
        return sender;
    }

    public void setSender(Role sender) {
        this.sender = sender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
