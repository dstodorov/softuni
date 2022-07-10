package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        if (distance * this.fuelConsumption <= this.fuelQuantity) {
            this.fuelQuantity -= distance * this.fuelConsumption;
            DecimalFormat df = new DecimalFormat("#.##");
            return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
        } else {
            return this.getClass().getSimpleName() + " needs refueling";
        }
    }

    public void refuel(double litters) {
        this.fuelQuantity += litters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
