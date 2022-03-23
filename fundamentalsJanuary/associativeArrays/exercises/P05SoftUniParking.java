package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingLots = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] inputCommands = scanner.nextLine().split(" ");
            String command = inputCommands[0];

            if (command.equals("register")) {
                String registrationOfUsername = inputCommands[1];
                String licensePlate = inputCommands[2];

                String username = parkingLots.get(registrationOfUsername);

                if (username != null) {
                    System.out.println("ERROR: already registered with plate number " + licensePlate);
                } else {
                    parkingLots.put(registrationOfUsername, licensePlate);
                    System.out.println(registrationOfUsername + " registered " + licensePlate + " successfully");
                }
            } else if (command.equals("unregister")) {
                String registrationOfUsername = inputCommands[1];
                boolean successfullyUnregistered = false;

                for (Map.Entry<String, String> lot : parkingLots.entrySet()) {
                    if (lot.getKey().equals(registrationOfUsername)) {
                        parkingLots.remove(lot.getKey());
                        System.out.println(registrationOfUsername + " unregistered successfully");
                        successfullyUnregistered = true;
                        break;
                    }
                }
                if (!successfullyUnregistered) System.out.println("ERROR: user " + registrationOfUsername + " not found");
            }
        }

        for (Map.Entry<String, String> lot : parkingLots.entrySet()) {
            System.out.println(lot.getKey() + " => " + lot.getValue());
        }
    }
}
