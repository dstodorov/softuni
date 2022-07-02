package SoftUni.advancedMay.oop.encapsulation.exercises.pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (isInvalidTopping(toppingType))
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 50)
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.weight * ToppingTypes.valueOf(this.toppingType).getModifier();
    }

    public boolean isInvalidTopping(String name) {
        for (ToppingTypes type : ToppingTypes.values()) {
            if (type.name().equals(name)) return false;
        }
        return true;
    }
}
