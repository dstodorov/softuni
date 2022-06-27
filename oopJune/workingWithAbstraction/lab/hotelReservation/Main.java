package SoftUni.oopJune.workingWithAbstraction.lab.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDetails = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(inputDetails[0]);
        int numberOfDays = Integer.parseInt(inputDetails[1]);
        String season = inputDetails[2];
        String discountType = inputDetails[3];

        double totalPrice = PriceCalculator.calculate(pricePerDay, numberOfDays, season, discountType);

        System.out.printf("%.2f", totalPrice);
    }
}
