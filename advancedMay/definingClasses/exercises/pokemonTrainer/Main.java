package SoftUni.advancedMay.definingClasses.exercises.pokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] inputDetails = input.split("\\s+");
            String trainerName = inputDetails[0];
            String pokemonName = inputDetails[1];
            String pokemonElement = inputDetails[2];
            int pokemonHealth = Integer.parseInt(inputDetails[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = trainers.get(trainerName);
            if (trainer != null) {
                trainer.pokemonList.add(pokemon);
            } else {
                List<Pokemon> pokemonList = new ArrayList<>();
                pokemonList.add(pokemon);
                trainers.put(trainerName, new Trainer(trainerName, pokemonList));
            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String element = command;
            trainers.forEach((key, trainer) -> {
                if (trainer.pokemonList.stream().filter(pokemon -> pokemon.getElement().equals(element)).collect(Collectors.toList()).size() > 0) {
                    trainer.increaseBadges();
                } else {
                    trainer.pokemonList.forEach(Pokemon::decreaseHealth);
                }

                trainer.pokemonList.removeIf(pokemon -> pokemon.getHealth() <= 0);
            });

            command = scanner.nextLine();
        }

        Map<String, Trainer> sorted = new LinkedHashMap<>();

        trainers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((Comparator.comparingInt(Trainer::getNumberOfBadges)).reversed()))
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        sorted.forEach((key, trainer) -> {
            System.out.println(trainer.getName() + " " + trainer.getNumberOfBadges() + " " + trainer.pokemonList.size());
        });
    }
}
