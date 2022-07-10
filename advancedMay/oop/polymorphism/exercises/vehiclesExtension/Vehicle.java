package SoftUni.advancedMay.oop.polymorphism.exercises.vehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;
    protected double originalFuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.originalFuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
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
        if (litters < 1) System.out.println("Fuel must be a positive number");
        else if (litters + this.fuelQuantity > this.tankCapacity) System.out.println("Cannot fit fuel in tank");
        else this.fuelQuantity += litters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
