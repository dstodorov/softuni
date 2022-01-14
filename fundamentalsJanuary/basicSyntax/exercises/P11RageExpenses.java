package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double rageExpenses = 0;
        int brokenHeadsetsCount = 0;
        int brokenMiceCount = 0;
        int brokenKeyboardsCount = 0;
        int brokenDisplaysCount = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            boolean brokenHeadset = false;
            boolean brokenMouse = false;
            boolean brokenKeyboard = false;

            if (i % 2 == 0) {
                brokenHeadsetsCount++;
                brokenHeadset = true;
            }
            if (i % 3 == 0) {
                brokenMiceCount++;
                brokenMouse = true;
            }
            if(brokenHeadset && brokenMouse) {
                brokenKeyboardsCount++;
                brokenKeyboard = true;
            }
            if (brokenKeyboard && brokenKeyboardsCount % 2 == 0) {
                brokenDisplaysCount++;
            }
        }

        rageExpenses =
                  brokenHeadsetsCount * headsetPrice
                + brokenMiceCount * mousePrice
                + brokenKeyboardsCount * keyboardPrice
                + brokenDisplaysCount * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
