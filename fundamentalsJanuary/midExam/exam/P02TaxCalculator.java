package SoftUni.fundamentalsJanuary.midExam.exam;

import java.util.Scanner;

public class P02TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicles = scanner.nextLine().split(">>");
        double total = 0;

        for (int i = 0; i < vehicles.length; i++) {
            String[] vehicle = vehicles[i].split(" ");
            String carType = vehicle[0];
            int yearsOfTaxing = Integer.parseInt(vehicle[1]);
            int kilometers = Integer.parseInt(vehicle[2]);

            int initialTax = 0;
            int taxDeclineAmount = 0;
            double taxIncreaseAmount = 0;
            double totalTaxes = 0;

            if (carType.equals("family")) {
                initialTax = 50;
                taxDeclineAmount = yearsOfTaxing * 5;
                taxIncreaseAmount = kilometers / 3000 * 12;

                totalTaxes = initialTax - taxDeclineAmount + taxIncreaseAmount;
            }
            else if (carType.equals("heavyDuty")) {
                initialTax = 80;
                taxDeclineAmount = yearsOfTaxing * 8;
                taxIncreaseAmount = kilometers / 9000 * 14;
                totalTaxes = initialTax - taxDeclineAmount + taxIncreaseAmount;
            }
            else if (carType.equals("sports")) {
                initialTax = 100;
                taxDeclineAmount = yearsOfTaxing * 9;
                taxIncreaseAmount = kilometers / 2000 * 18;
                totalTaxes = initialTax - taxDeclineAmount + taxIncreaseAmount;
            }
            else {
                System.out.println("Invalid car type.");
                continue;
            }
            total += totalTaxes;
            System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTaxes);
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", total);
    }
}
