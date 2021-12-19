package SoftUni.basics.preExam;

import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalLittersOfRakia = 0;
        double degrees = 0;

        for (int i = 1; i <= days; i++) {
            double rakiaAmount = Double.parseDouble(scanner.nextLine());
            double rakiaDegrees = Double.parseDouble(scanner.nextLine());
            degrees += rakiaAmount * rakiaDegrees;
            totalLittersOfRakia += rakiaAmount;
        }
        degrees /= totalLittersOfRakia;

        System.out.printf("Liter: %.2f%n", totalLittersOfRakia);
        System.out.printf("Degrees: %.2f%n", degrees);

        if (degrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (degrees >= 38 && degrees <= 42) {
            System.out.println("Super!");

        } else if (degrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
