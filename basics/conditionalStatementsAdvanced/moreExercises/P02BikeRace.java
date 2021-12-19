package SoftUni.basics.conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String roadType = scanner.nextLine();

        double discount = 0.0;
        double totalCost = 0.0;


        if (roadType.equals("trail")){
            totalCost = (juniorBikers * 5.5) + (seniorBikers * 7.0);
        }
        if (roadType.equals("cross-country")) {
            if (juniorBikers + seniorBikers >= 50) {
                discount = 0.25;
            }
            totalCost = ((juniorBikers * 8) + (seniorBikers * 9.5)) - (((juniorBikers * 8) + (seniorBikers * 9.5)) * discount);
        }
        if (roadType.equals("downhill")) {
            totalCost = (juniorBikers * 12.25) + (seniorBikers * 13.75);
        }
        if (roadType.equals("road")) {
            totalCost = (juniorBikers * 20.00) + (seniorBikers * 21.50);
        }

        totalCost *= 0.95;
        System.out.printf("%.2f", totalCost);
    }
}
