package SoftUni.advancedMay.definingClasses.exercises.rawData;

public class Cargo {
    private final int cargoWeight;
    private final String cargoType;

    public Cargo(int cargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }
}
