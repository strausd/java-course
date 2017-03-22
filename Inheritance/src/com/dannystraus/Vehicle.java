package com.dannystraus;

/**
 * Created by dstraus on 3/21/17.
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void street(int direction) {
        this.currentDirection += direction;

    }
}
