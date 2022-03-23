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

            plants.put(plantName, plantRarity);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            Pattern pattern = Pattern.compile("\\b(?<command>\\w+): (?<plantName>\\w+)(\\s-\\s(?<rating>\\d+))?\\b");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String command = matcher.group("command");
                String plant = matcher.group("plantName");

                if (plants.containsKey(plant)) {
                    if (command.equals("Rate")) {
                        double rating = Double.parseDouble(matcher.group("rating"));
                        if (plantRatings.containsKey(plant)) {
                            plantRatings.get(plant).add(rating);
                        } else {
                            List<Double> ratingList = new ArrayList<>();
                            ratingList.add(rating);
                            plantRatings.put(plant, ratingList);
                        }
                    } else if (command.equals("Update")) {
                        int rarity = Integer.parseInt(matcher.group("rating"));
                        plants.put(plant, rarity);
                    } else if (command.equals("Reset")) {
                        if (plantRatings.containsKey(plant)) {
                            plantRatings.get(plant).clear();
                        }
                    }
                } else {
                    System.out.println("error");
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
