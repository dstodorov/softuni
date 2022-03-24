package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPlants = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> plantRatings = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPlants; i++) {
            String[] plantDetails = scanner.nextLine().split("<->");
            String plantName = plantDetails[0];
            int plantRarity = Integer.parseInt(plantDetails[1]);
            plantRatings.putIfAbsent(plantName, new ArrayList<>());
            plants.put(plantName, plantRarity);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] inputCommands = input.split("\\s+");
            String plant = inputCommands[1];


            if (!plants.containsKey(plant)) {
                System.out.println("error");
            } else {
                if (inputCommands[0].contains("Rate")) {
                    Double rating = Double.parseDouble(inputCommands[3]);
                    plantRatings.get(plant).add(rating);
                } else if (inputCommands[0].contains("Update")) {
                    Integer rarity = Integer.parseInt(inputCommands[3]);
                    plants.put(plant, rarity);
                } else if (inputCommands[0].contains("Reset")) {
                    plantRatings.get(plant).clear();
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> plant : plants.entrySet()) {
            double average = plantRatings.get(plant.getKey()).stream().mapToDouble(d -> d).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant.getKey(), plant.getValue(), average);
        }
    }
}
