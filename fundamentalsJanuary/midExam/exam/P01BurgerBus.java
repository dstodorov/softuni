package SoftUni.fundamentalsJanuary.midExam.exam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        for (int i = 1; i <= numberOfCities; i++) {
            String city = scanner.nextLine();
            double moneyEarned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            boolean noSpecialEvent = false;

            double profitForCurrentCity = 0;
            if (i % 5 == 0){
                noSpecialEvent = true;
                moneyEarned -= moneyEarned * 0.1;
            }

            profitForCurrentCity += moneyEarned - expenses;

            if (i % 3 == 0 && !noSpecialEvent) {
                profitForCurrentCity -= expenses * 0.5;
            }

            totalProfit += profitForCurrentCity;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, profitForCurrentCity);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
