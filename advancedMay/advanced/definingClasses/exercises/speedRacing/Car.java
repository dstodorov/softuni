package SoftUni.advancedMay.advanced.definingClasses.exercises.speedRacing;

public class Car {

    private final String model;
    private double fuelAmount;
    private final double fuelCostPerKm;
    private int distanceTraveled;

    public Car(String model, int fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTraveled = 0;
    }

    public boolean hasFuel(int distance) {
        return distance * fuelCostPerKm <= fuelAmount;
    }

    public void drive(int distance) {
        this.distanceTraveled += distance;
        fuelAmount -= distance * fuelCostPerKm;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
