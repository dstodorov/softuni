package SoftUni.basics.preExam;

import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();

        double pricePerNight = 0;
        double discount = 0;
        switch (roomType) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                if (days < 10) {
                    discount = 0.3;
                } else if (days <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.5;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                if (days < 10) {
                    discount = 0.1;
                } else if (days <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.2;
                }
                break;
        }

        double totalCost = (days - 1) * pricePerNight;
        double totalCostWithDiscount = totalCost - (totalCost * discount);

        if (score.equals("positive")) {
            totalCostWithDiscount += totalCostWithDiscount * 0.25;
        } else {
            totalCostWithDiscount -= totalCostWithDiscount * 0.1;
        }

        System.out.printf("%.2f", totalCostWithDiscount);
    }
}
