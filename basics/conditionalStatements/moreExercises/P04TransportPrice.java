package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double taxiPrice = 0;
        double busPrice = 0;
        double trainPrice = 0;

        if (dayTime.equals("day")) {
            taxiPrice = 0.7 + (0.79 * km);
        }
        if (dayTime.equals("night")) {
            taxiPrice = 0.7 + (0.9 * km);
        }
        if (km >= 20) {
            busPrice = 0.09 * km;
        }
        if (km >= 100) {
            trainPrice = 0.06 * km;
        }

        if (taxiPrice > 0 && busPrice > 0 && trainPrice > 0) {
            if (taxiPrice < busPrice && taxiPrice < trainPrice) System.out.printf("%.2f", taxiPrice);
            else if (busPrice < taxiPrice && busPrice < trainPrice) System.out.printf("%.2f", busPrice);
            else if (trainPrice < taxiPrice && trainPrice < busPrice) System.out.printf("%.2f", trainPrice);
        }

        if (taxiPrice > 0 && busPrice == 0 && trainPrice == 0) System.out.printf("%.2f", taxiPrice);

        if (busPrice > 0 && trainPrice == 0) {
            System.out.printf("%.2f", Math.min(taxiPrice, busPrice));
        }

        if (busPrice == 0 && trainPrice > 0) {
            System.out.printf("%.2f", Math.min(taxiPrice, trainPrice));
        }
    }
}
