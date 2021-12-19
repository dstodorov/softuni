package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int collectedMoney = 0;
        int numberOfToys = 0;
        int giftMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                collectedMoney += giftMoney - 1;
                giftMoney += 10;
            } else {
                numberOfToys ++;
            }
        }

        collectedMoney += numberOfToys * toyPrice;

        if (collectedMoney >= laundry) {
            System.out.printf("Yes! %.2f", collectedMoney - laundry);
        } else {
            System.out.printf("No! %.2f", laundry - collectedMoney);
        }
    }
}
