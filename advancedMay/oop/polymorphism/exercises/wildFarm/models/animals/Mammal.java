package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        if (this.getClass().getSimpleName().equals("Cat")) {
            return this.getClass().toString();
        }
        return this.getClass().getSimpleName() + "[" + super.getAnimalName() + ", " + decimalFormat.format(super.getAnimalWeight()) + ", " + this.livingRegion + ", " + super.getFoodEaten() + "]";
    }
}
