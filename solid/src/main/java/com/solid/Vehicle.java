package com.solid;

abstract public class Vehicle {
    private int regNr;
    private String Name;
    private double speed;

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    private double calcSpeed() {
        //do some work
        return 0.0;
    }

    // Applying Single Responsibilities concept this  method should be moved to own classes.
    /*
    private void compareToTruck() {
        // do some work
    }
     */

}
