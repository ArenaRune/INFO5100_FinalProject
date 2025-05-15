/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import model.person.Person;
import model.workrequest.WorkQueue;

/**
 *
 * @author arenarune
 */
public abstract class Role {
    Person person;
    WorkQueue workQueue;
    
    public enum RoleType {
        AdminRole("Admin"),
        ScreenWriterRole("Screen Writer"),
        DirectorRole("Director"),
        CastRole("Cast"),
        ProducerRole("Producer"),
        DistributorRole("Distributor"),
        TheaterManagerRole("Theater Manager"),
        CustomerRole("Customer"),
        SupportRole("Customer Supoort");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public Role(Person person) {
        this.person = person;
        workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public String getName() {
        return this.person.getName();
    }

    public Person getPerson() {
        return person;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}