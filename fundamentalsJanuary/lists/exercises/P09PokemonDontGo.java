package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonDistances = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int totalSum = 0;


        while (!pokemonDistances.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int removedElementValue = 0;

            if (index < 0) {
                removedElementValue =  pokemonDistances.get(0);
                pokemonDistances.remove(0);
                pokemonDistances.add(0, pokemonDistances.get(pokemonDistances.size() - 1));
            } else if (index > pokemonDistances.size() - 1) {
                removedElementValue = pokemonDistances.get(pokemonDistances.size() - 1);
                pokemonDistances.remove(pokemonDistances.size() - 1);
                pokemonDistances.add(pokemonDistances.get(0));
            } else {
                removedElementValue = pokemonDistances.get(index);
                pokemonDistances.remove(index);
            }

            increaseDecreaseElements(pokemonDistances, removedElementValue);
            totalSum += removedElementValue;
        }
        System.out.println(totalSum);
    }

    private static void increaseDecreaseElements(List<Integer> pokemonDistances, int removedElementValue) {
        for (int i = 0; i < pokemonDistances.size(); i++) {
            if (pokemonDistances.get(i) <= removedElementValue) {
                pokemonDistances.set(i, pokemonDistances.get(i) + removedElementValue);
            } else if (pokemonDistances.get(i) > removedElementValue) {
                pokemonDistances.set(i, pokemonDistances.get(i) - removedElementValue);
            }
        }
    }
}
