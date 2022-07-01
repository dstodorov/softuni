package SoftUni.advancedMay.advanced.definingClasses.exercises.rawData;

public class Engine {
    private final int engineSpeed;
    private final int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
