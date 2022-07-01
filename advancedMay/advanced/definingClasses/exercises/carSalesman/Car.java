package SoftUni.advancedMay.advanced.definingClasses.exercises.carSalesman;

public class Car {
    //Mandatory fields
    private String model;
    private Engine engine;
    //Optional fields
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.model + ":\n" +
                this.engine + "\n" +
                "Weight: " + this.weight + "\n" +
                "Color: " + this.color + "\n";
    }
}
