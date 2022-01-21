package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int pokedTargets = 0;
        int originalPokePower = pokePowerN;

        while (pokePowerN >= distanceBetweenTargetsM) {
            pokePowerN -= distanceBetweenTargetsM;
            pokedTargets++;
            if (pokePowerN == originalPokePower * 0.5 && exhaustionFactorY != 0) {
                pokePowerN /= exhaustionFactorY;
            }
        }
        System.out.println(pokePowerN);
        System.out.println(pokedTargets);
    }
}
