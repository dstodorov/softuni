package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyardSqMeters = Integer.parseInt(scanner.nextLine());
        double grapesPerSqMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double kilogramsOfGrapes = (0.4 * vineyardSqMeters) * grapesPerSqMeter;
        double totalLitersOfWineProduced = kilogramsOfGrapes / 2.5;

        if (totalLitersOfWineProduced >= wineNeeded) {
            double litersWineForWorkers = totalLitersOfWineProduced - wineNeeded;
            double littersWinePerWorker = litersWineForWorkers / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(totalLitersOfWineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(litersWineForWorkers), Math.ceil(littersWinePerWorker));
        } else {
            double litersOfWineNeeded = wineNeeded - totalLitersOfWineProduced;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersOfWineNeeded));
        }
    }
}
