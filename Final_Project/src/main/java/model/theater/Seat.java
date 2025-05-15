/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.theater;

/**
 *
 * @author arenarune
 */
public class Seat {
    private char row;
    private byte number;
    private String name;
    private boolean isBooked;
    private Show show;

    public Seat(char row, byte number) {
        this.row = row;
        this.number = number;
        name = row + " " + number;
        this.isBooked = false;
    }

    public char getRow() {
        return row;
    }

    public byte getNumber() {
        return number;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        this.isBooked = true;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "Seat{" + "row=" + row + ", number=" + number + '}';
    }
}
