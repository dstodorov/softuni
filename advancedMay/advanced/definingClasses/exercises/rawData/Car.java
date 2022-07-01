package SoftUni.advancedMay.advanced.definingClasses.exercises.rawData;

public class Car {
    private String model;
    private final Engine engine;
    private final Cargo cargo;
    private final Tire[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }
}
