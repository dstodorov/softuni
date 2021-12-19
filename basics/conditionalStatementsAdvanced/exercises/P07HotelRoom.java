package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerNightApartment = 0.0;
        double pricePerNightStudio = 0.0;
        double discountStudio = 0.0;
        double discountApartment = 0.0;

        if (month.equals("May") || month.equals("October")) {
            pricePerNightStudio = 50.00;
            pricePerNightApartment = 65.00;
            if (days > 7 && days <= 14) {
                discountStudio = 0.05;
            } else if (days > 14) {
                discountStudio = 0.3;
            }
        }
        if (month.equals("June") || month.equals("September ")) {
            pricePerNightStudio = 75.20;
            pricePerNightApartment = 68.70;
            if (days > 14) {
                discountStudio = 0.2;
            }
        }
        if (month.equals("July") || month.equals("August")) {
            pricePerNightStudio = 76.00;
            pricePerNightApartment = 77.00;
        }

        if (days > 14) {
            discountApartment = 0.1;
        }

        double totalStudio = pricePerNightStudio * days - (pricePerNightStudio * days * discountStudio);
        double totalApartment = pricePerNightApartment * days - (pricePerNightApartment * days * discountApartment);

        System.out.printf("Apartment: %.2f lv.%n", totalApartment);
        System.out.printf("Studio: %.2f lv.", totalStudio);

    }
}
