package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_FUEL_CONSUMPTION = 1.6;
    private final static double FUEL_LEAK_PERCENTAGE = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_FUEL_CONSUMPTION);
    }

    @Override
    public void refuel(double litters) {
        double fuelNeeded = litters * FUEL_LEAK_PERCENTAGE;
        super.refuel(fuelNeeded);
    }
}
