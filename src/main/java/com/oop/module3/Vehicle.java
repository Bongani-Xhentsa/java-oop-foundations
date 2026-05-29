package com.oop.module3;

public class Vehicle {
    private final String make;
    private final String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String startEngine() {
        return "Starting vehicle engine";
    }
}
