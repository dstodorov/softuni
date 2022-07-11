package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.AnimalSound;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.TIGER.getSound());
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
