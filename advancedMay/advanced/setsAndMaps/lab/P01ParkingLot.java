package SoftUni.advancedMay.advanced.setsAndMaps.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLots = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] params = input.split(", ");

            if (params[0].equals("IN")) {
                parkingLots.add(params[1]);
            } else {
                parkingLots.remove(params[1]);
            }
            input = scanner.nextLine();
        }

        if (parkingLots.isEmpty()) System.out.println("Parking Lot is Empty");
        else {
            for (String carNumber : parkingLots) {
                System.out.println(carNumber);
            }
        }
    }
}
