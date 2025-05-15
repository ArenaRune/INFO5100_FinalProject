/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.person.Person;
import model.role.ProducerRole;

/**
 *
 * @author arenarune
 */
public class ProducerOrganization extends Organization {
    private ArrayList<ProducerRole> producerRoles;
    
    public ProducerOrganization() {
        super(Type.Producer.getValue());
        producerRoles = new ArrayList<ProducerRole>();
    }
    
    public ProducerRole newProducer(Person person) {
        ProducerRole producerRole = new ProducerRole(person);
        producerRoles.add(producerRole);
        return producerRole;
    }

    public ArrayList<ProducerRole> getProducerRoles() {
        return producerRoles;
    }
    @Override
    public String toString() {
        return "Producer";
    }
}
