package SoftUni.fundamentalsJanuary.finalExam.exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Animal> animals = new LinkedHashMap<>();
        Map<String, Integer> areas = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {
            String[] inputCommands = input.split(" ");

            String[] animalDetails = inputCommands[1].split("-");
            String animalName = animalDetails[0];
            int foodQuantity = Integer.parseInt(animalDetails[1]);

            if (inputCommands[0].contains("Add")) {
                String area = animalDetails[2];
                if (animals.containsKey(animalName)) {
                    Animal animal = animals.get(animalName);
                    animal.setFood(animal.getFood() + foodQuantity);
                } else {
                    animals.put(animalName, new Animal(animalName, foodQuantity, area));

                    if (areas.containsKey(area)) {
                        areas.put(area, areas.get(area) + 1);
                    } else {
                        areas.put(area, 1);
                    }
                }
            } else if (inputCommands[0].contains("Feed")) {
                if (animals.containsKey(animalName)) {
                    Animal animal = animals.get(animalName);
                    animal.setFood(animal.getFood() - Integer.parseInt(animalDetails[1]));
                    if (animal.getFood() <= 0) {
                        areas.put(animal.getAnimalArea(), areas.get(animal.getAnimalArea()) - 1);
                        animals.remove(animalName);
                        System.out.printf("%s was successfully fed%n", animalName);
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        for (Map.Entry<String, Animal> animal : animals.entrySet()) {
            Animal currentAnimal = animal.getValue();
            System.out.printf(" %s -> %dg%n", currentAnimal.getAnimalName(), currentAnimal.getFood());
        }
        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, Integer> area : areas.entrySet()) {
            if (area.getValue() > 0) {
                System.out.printf(" %s: %d%n", area.getKey(), area.getValue());
            }
        }
    }

    static class Animal {
        private String animalName;
        private int food;
        private String animalArea;

        public Animal(String animalName, int food, String animalArea) {
            this.animalName = animalName;
            this.food = food;
            this.animalArea = animalArea;
        }

        public String getAnimalName() {
            return animalName;
        }

        public void setAnimalName(String animalName) {
            this.animalName = animalName;
        }

        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            this.food = food;
        }

        public String getAnimalArea() {
            return animalArea;
        }

        public void setAnimalArea(String animalArea) {
            this.animalArea = animalArea;
        }

    }
}
