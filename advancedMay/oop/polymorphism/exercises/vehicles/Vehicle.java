package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double traveledDistance = 0;

    public final DecimalFormat PRINT_FORMAT = new DecimalFormat("#.##");

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double litters);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    protected void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }
}
