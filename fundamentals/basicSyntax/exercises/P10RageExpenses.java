package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float totalCost = 0;
        int keyboardTrashes = 0;

        int lostGames = Integer.parseInt(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                totalCost += keyboardPrice;
                keyboardTrashes++;
            }
            if (i % 2 == 0) {
                totalCost += headsetPrice;
            }
            if (i % 3 == 0) {
                totalCost += mousePrice;
            }

            if (keyboardTrashes == 2) {
                totalCost += displayPrice;
                keyboardTrashes = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
