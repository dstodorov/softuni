package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int maxCoins = (int) (money / 0.01);
        int coins = 0;

        while (maxCoins > 0) {
            if (maxCoins >= 200) {
                coins += maxCoins / 200;
                maxCoins = maxCoins - (maxCoins / 200) * 200;
            } else if (maxCoins >= 100) {
                coins += maxCoins / 100;
                maxCoins = maxCoins - (maxCoins / 100) * 100;
            } else if (maxCoins >= 50) {
                coins += maxCoins / 50;
                maxCoins = maxCoins - (maxCoins / 50) * 50;
            } else if (maxCoins >= 20) {
                coins += maxCoins / 20;
                maxCoins = maxCoins - (maxCoins / 20) * 20;
            } else if (maxCoins >= 10) {
                coins += maxCoins / 10;
                maxCoins = maxCoins - (maxCoins / 10) * 10;
            } else if (maxCoins >= 5) {
                coins += maxCoins / 5;
                maxCoins = maxCoins - (maxCoins / 5) * 5;
            } else if (maxCoins >= 2) {
                coins += maxCoins / 2;
                maxCoins = maxCoins - (maxCoins / 2) * 2;
            } else {
                coins += 1;
                maxCoins -= 1;
            }
        }
        System.out.println(coins);
    }
}
