package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void drive(double distance) {
        double consumptionPerKm = super.getFuelConsumption() + 0.9;
        double littersNeeded = distance * consumptionPerKm;
        if (littersNeeded <= super.getFuelQuantity()) {
            super.setTraveledDistance(super.getTraveledDistance() + distance);
            super.setFuelQuantity(super.getFuelQuantity() - littersNeeded);
            System.out.println("Car travelled " + super.PRINT_FORMAT.format(distance) + " km");
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + litters);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", super.getFuelQuantity());
    }
}
