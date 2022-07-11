package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.AnimalSound;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;


    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println(AnimalSound.CAT.getSound());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + super.getAnimalName() + ", " + this.breed + ", " + decimalFormat.format(super.getAnimalWeight()) + ", " + super.getLivingRegion() + ", " + super.getFoodEaten() + "]";
    }
}
