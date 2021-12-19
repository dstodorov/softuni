package SoftUni.basics.nestedLoops.moreExercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double parkingCost = 0;

        for (int day = 1; day <= days; day++) {
            double currentDayCost = 0;
            for (int hour = 1; hour <= hours; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    parkingCost += 2.5;
                    currentDayCost += 2.5;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    parkingCost += 1.25;
                    currentDayCost += 1.25;
                } else {
                    parkingCost += 1;
                    currentDayCost += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, currentDayCost);
        }
        System.out.printf("Total: %.2f leva%n", parkingCost);
    }
}
