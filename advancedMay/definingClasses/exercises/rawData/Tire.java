package SoftUni.advancedMay.definingClasses.exercises.rawData;

public class Tire {
    private final int tireAge;
    private final double tirePressure;

    public Tire(int tireAge, double tirePressure) {
        this.tireAge = tireAge;
        this.tirePressure = tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public double getTirePressure() {
        return tirePressure;
    }
}
