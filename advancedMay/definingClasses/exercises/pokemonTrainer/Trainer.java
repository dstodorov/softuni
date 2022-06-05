package SoftUni.advancedMay.definingClasses.exercises.pokemonTrainer;

import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    List<Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
        this.numberOfBadges = 0;
    }

    public void increaseBadges() {
        this.numberOfBadges++;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public String getName() {
        return name;
    }
}
