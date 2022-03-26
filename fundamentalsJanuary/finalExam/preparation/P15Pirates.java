package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P15Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, City> cities = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String[] townInfo = input.split("\\|{2}");

            if (cities.containsKey(townInfo[0])) {
                City city = cities.get(townInfo[0]);
                city.setPopulation(city.getPopulation() + Integer.parseInt(townInfo[1]));
                city.setGold(city.getGold() + Integer.parseInt(townInfo[2]));
            } else {
                cities.put(townInfo[0], new City(townInfo[0], Integer.parseInt(townInfo[1]), Integer.parseInt(townInfo[2])));
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputCommands = input.split("=>");
            City city = cities.get(inputCommands[1]);

            switch (inputCommands[0]) {
                case "Plunder" : {
                    plunderCity(city, Integer.parseInt(inputCommands[2]), Integer.parseInt(inputCommands[3]));
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city.getName(), Integer.parseInt(inputCommands[3]), Integer.parseInt(inputCommands[2]));
                    if (city.getPopulation() == 0 || city.getGold() == 0){
                        cities.remove(city.getName());
                        System.out.printf("%s has been wiped off the map!%n", inputCommands[1]);
                    }
                    break;
                }
                case "Prosper" : {
                    if (Integer.parseInt(inputCommands[2]) >= 0) {
                        giveGold(city, Integer.parseInt(inputCommands[2]));
                        System.out.printf("%s gold added to the city treasury. %s now has %d gold.%n", inputCommands[2], city.getName(), city.getGold());
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if (cities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            printMap(cities);
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    private static void printMap(Map<String, City> cities) {
        for (Map.Entry<String, City> city : cities.entrySet()) {
            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", city.getValue().getName(), city.getValue().getPopulation(), city.getValue().getGold());
        }
    }

    private static void giveGold(City city, int gold) {
        city.setGold(city.getGold() + gold);
    }

    private static void plunderCity(City city, int population, int gold) {
        city.setPopulation(city.getPopulation() - population);
        city.setGold(city.getGold() - gold);
    }

    static class City {
        private String name;
        private int population;
        private int gold;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

    }
}
