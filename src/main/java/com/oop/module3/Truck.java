package com.oop.module3;

public class Truck extends Vehicle {
    private final double payloadCapacity;

    public Truck(String make, String model, double payloadCapacity) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    @Override
    public String startEngine() {
        return "Starting truck engine";
    }
}
