package SoftUni.advancedMay.oop.polymorphism.exercises.vehiclesExtension;

public class Bus extends Vehicle {

    private static final double FULL_BUS_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public String drive(double distance) {
        super.setFuelConsumption(super.originalFuelConsumption + FULL_BUS_CONSUMPTION);
        return super.drive(distance);
    }
}
