package SoftUni.basics.preExam;

import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeaTrips = Integer.parseInt(scanner.nextLine());
        int totalMountainTrips = Integer.parseInt(scanner.nextLine());

        int totalTrips = totalSeaTrips + totalMountainTrips;
        int seaTripPrice = 680;
        int mountainTripPrice = 499;
        int profit = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            if (input.equals("sea")) {
                if (totalSeaTrips > 0) {
                    profit += seaTripPrice;
                    totalSeaTrips--;
                }
            } else if (input.equals("mountain")) {
                if (totalMountainTrips > 0) {
                    profit += mountainTripPrice;
                    totalMountainTrips--;
                }
            }
            if (totalSeaTrips == 0 && totalMountainTrips == 0) break;
            input = scanner.nextLine();
        }

        if (totalSeaTrips == 0 && totalMountainTrips == 0) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
