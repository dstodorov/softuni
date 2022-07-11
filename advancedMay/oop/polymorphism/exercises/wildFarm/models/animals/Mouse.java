package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals;

import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.AnimalSound;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.MOUSE.getSound());
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
