package SoftUni.fundamentals.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int pokeTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokedTargets = 0;
        int originalPokePower = pokePower;

        while (pokePower >= pokeTargets) {
            pokePower -= pokeTargets;
            pokedTargets++;
            if (pokePower == originalPokePower * 0.5 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}