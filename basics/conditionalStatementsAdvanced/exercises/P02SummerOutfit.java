package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String outfit = "";
        String boots = "";

        if (dayTime.equals("Morning")) {
            if (temp >= 10 && temp <= 18) {
                outfit = "Sweatshirt";
                boots = "Sneakers";
            } else if (temp > 18 && temp <= 24) {
                outfit = "Shirt";
                boots = "Moccasins";
            } else if (temp >= 25) {
                outfit = "T-Shirt";
                boots = "Sandals";
            }
        }
        if (dayTime.equals("Afternoon")) {
            if (temp >= 10 && temp <= 18) {
                outfit = "Shirt";
                boots = "Moccasins";
            } else if (temp > 18 && temp <= 24) {
                outfit = "T-Shirt";
                boots = "Sandals";
            } else if (temp >= 25) {
                outfit = "Swim Suit";
                boots = "Barefoot";
            }
        }
        if (dayTime.equals("Evening")) {
            if (temp >= 10 && temp <= 18) {
                outfit = "Shirt";
                boots = "Moccasins";
            } else if (temp > 18 && temp <= 24) {
                outfit = "Moccasins";
                boots = "Moccasins";
            } else if (temp >= 25) {
                outfit = "Shirt";
                boots = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temp, outfit, boots);
    }
}
