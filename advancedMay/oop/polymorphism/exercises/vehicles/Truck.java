package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void drive(double distance) {
        double consumptionPerKm = super.getFuelConsumption() + 1.6;
        double littersNeeded = distance * consumptionPerKm;
        if (littersNeeded <= super.getFuelQuantity()) {
            super.setTraveledDistance(super.getTraveledDistance() + distance);
            super.setFuelQuantity(super.getFuelQuantity() - littersNeeded);
            System.out.println("Truck travelled " + super.PRINT_FORMAT.format(distance) + " km");
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + (0.95 * litters));
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", super.getFuelQuantity());
    }
}
