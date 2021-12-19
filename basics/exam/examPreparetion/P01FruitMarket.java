package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaAmountKg = Double.parseDouble(scanner.nextLine());
        double orangeAmountKg = Double.parseDouble(scanner.nextLine());
        double raspberryAmountKg = Double.parseDouble(scanner.nextLine());
        double strawberryAmountKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.5;
        double orangePrice = raspberryPrice - (raspberryPrice  * 0.4);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.8);
        double total = (strawberryPrice * strawberryAmountKg) + (raspberryPrice * raspberryAmountKg) + (orangePrice * orangeAmountKg) + (bananaPrice * bananaAmountKg);
        System.out.printf("%.2f", total);
        System.out.println();
    }
}
