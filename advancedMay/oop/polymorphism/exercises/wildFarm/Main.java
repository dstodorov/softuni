package SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm;

import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.animals.*;
import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.foods.Meat;
import SoftUni.advancedMay.oop.polymorphism.exercises.wildFarm.models.foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();

        while (!input.equals("End")) {
            String[] animalDetails = input.split("\\s+");
            String[] foodDetails = scanner.nextLine().split("\\s+");
            Animal animal = createAnimal(animalDetails);
            Food food = createFood(foodDetails);

            animal.makeSound();

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animals.add(animal);

            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }

    private static Food createFood(String[] foodParams) {
        String foodType = foodParams[0];

        switch (foodType) {
            case "Vegetable" :
                return new Vegetable(Integer.parseInt(foodParams[1]));
            case "Meat" :
                return new Meat(Integer.parseInt(foodParams[1]));
            default:
                return null;
        }
    }

    private static Animal createAnimal(String[] animalParams) {
        String animalType = animalParams[0];
        String animalName = animalParams[1];
        double animalWeight = Double.parseDouble(animalParams[2]);
        String animalLivingRegion = animalParams[3];

        switch (animalType) {
            case "Cat" :
                String catBreed = animalParams[4];
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
            case "Mouse" :
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Tiger" :
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra" :
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
        }
        return null;
    }
}
