package SoftUni.advancedMay.oop.polymorphism.exercises.vehiclesExtension;

public class Car extends Vehicle {
    private final static double ADDITIONAL_FUEL_CONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_FUEL_CONSUMPTION, tankCapacity);
    }
}
