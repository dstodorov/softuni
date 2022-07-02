package SoftUni.advancedMay.oop.encapsulation.exercises.pizzaCalories;

public class Dough {


    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public void setFlourType(String flourType) {
        if (isInvalidDough(flourType)) throw new IllegalArgumentException("Invalid type of dough.");
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (isInvalidDough(bakingTechnique)) throw new IllegalArgumentException("Invalid type of dough.");
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200) throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.weight * DougTypes.valueOf(this.flourType).getModifier() * DougTypes.valueOf(this.bakingTechnique).getModifier();
    }

    public boolean isInvalidDough(String name) {
        for (DougTypes type : DougTypes.values()) {
            if (type.name().equals(name)) return false;
        }
        return true;
    }
}
