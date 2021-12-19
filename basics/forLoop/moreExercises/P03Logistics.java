package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(scanner.nextLine());
        int totalWeight = 0;
        int total1Count = 0;
        int total2Count = 0;
        int total3Count = 0;

        for (int i = 0; i < numberOfLoads; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                total1Count += weight;
            } else if (weight <= 11) {
                total2Count += weight;
            } else {
                total3Count += weight;
            }

            totalWeight += weight;
        }

        System.out.printf("%.2f%n", 1.0 * (total1Count * 200 + total2Count * 175 + total3Count * 120) / totalWeight);
        System.out.printf("%.2f%%%n", (total1Count * 1.0 / totalWeight) * 100);
        System.out.printf("%.2f%%%n", (total2Count * 1.0 / totalWeight) * 100);
        System.out.printf("%.2f%%%n", (total3Count * 1.0 / totalWeight) * 100);

    }
}
