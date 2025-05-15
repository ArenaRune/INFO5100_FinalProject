/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

/**
 *
 * @author arenarune
 */
public abstract class Organization {
    public String name;

    public enum Type {
        Admin("Admin Organization"),
        Cast("Cast Organization"),
        Customer("Customer Organization"),
        CustomerSupport("Customer Support Organization"),
        Director("Director Organization"),
        Distributor("Distributor Organization"),
        Producer("Producer Organization"),
        ScreenWriter("Screen Writer Organization"),
        TheaterManager("Theater Manager Organization"),
        Analytics("Analytics Organization");
        
        private String value;
        
        private Type(String value){
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
    
    public Organization(String name) {
        this.name = name;
    }
    public String getType() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
