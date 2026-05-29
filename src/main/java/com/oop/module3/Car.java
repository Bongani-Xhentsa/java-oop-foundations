package com.oop.module3;

public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String startEngine() {
        return "Starting car engine";
    }
}
