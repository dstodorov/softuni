package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        int topSnowballSnow = 0;
        int topSnowballTime = 0;
        int topSnowballQuality = 0;
        double topSnowballValue = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime),snowballQuality);

            if (snowballValue > topSnowballValue) {
                topSnowballSnow = snowballSnow;
                topSnowballTime = snowballTime;
                topSnowballQuality = snowballQuality;
                topSnowballValue = snowballValue;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", topSnowballSnow, topSnowballTime, topSnowballValue, topSnowballQuality);
    }
}
