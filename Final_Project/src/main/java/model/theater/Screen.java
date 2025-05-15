/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.theater;

import java.util.ArrayList;

/**
 *
 * @author arenarune
 */
public class Screen {
    private String name;

    public Screen(String name) {
        this.name = name;
       
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Seat> generateSeats() {    
        ArrayList<Seat> seats = new ArrayList<Seat>();
        for (char row = 'A'; row < 'A' + 5; row++) {
            for (byte number = 1; number <= 10; number++) {
                seats.add(new Seat(row, number));
            }
        }
        return seats;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
