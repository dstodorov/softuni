package SoftUni.advancedMay.advanced.setsAndMaps.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> countries = new LinkedHashMap<>();

        while (!input.equals("report")) {
            String[] cityDetails = input.split("\\|");
            String city = cityDetails[0];
            String country = cityDetails[1];
            int population = Integer.parseInt(cityDetails[2]);

            if (countries.containsKey(country)) {
                countries.get(country).put(city, population);
            } else {
                Map<String, Integer> cities = new LinkedHashMap<>();
                cities.put(city, population);
                countries.put(country, cities);
            }

            input = scanner.nextLine();
        }

        Map<String, Long> countriesWithPopulation = countriesWithPopulation(countries);

        Map<String, Long> orderedCountries = new LinkedHashMap<>();
        countriesWithPopulation.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(x -> orderedCountries.put(x.getKey(), x.getValue()));

        orderedCountries.forEach((country, population) -> {
            System.out.printf("%s (total population: %d)%n", country, population);

            Map<String, Integer> sortedCities = new LinkedHashMap<>();

            countries.get(country).entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEachOrdered(x -> sortedCities.put(x.getKey(), x.getValue()));

            sortedCities.forEach((key, value) -> {
                System.out.printf("=>%s: %d%n", key, value);
            });

        });
    }

    private static Map<String, Long> countriesWithPopulation(Map<String, Map<String, Integer>> countries) {

        Map<String, Long> countriesWithPopulation = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> country : countries.entrySet()) {
            long population = getCountryPopulation(country);
            countriesWithPopulation.put(country.getKey(), population);
        }

        return countriesWithPopulation;
    }

    private static long getCountryPopulation(Map.Entry<String, Map<String, Integer>> country) {
        long sum = 0;
        for (Map.Entry<String, Integer> city : country.getValue().entrySet()) {
            sum += city.getValue();
        }

        return sum;
    }
}
