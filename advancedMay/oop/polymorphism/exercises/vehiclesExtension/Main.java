package SoftUni.advancedMay.oop.polymorphism.exercises.vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        int vehiclesNumber = 3;

        for (int i = 0; i < vehiclesNumber; i++) {
            String[] vehicleInfo = scanner.nextLine().split("\\s+");
            String vehicleType = vehicleInfo[0];
            double vehicleFuelQuantity = Double.parseDouble(vehicleInfo[1]);
            double vehicleFuelConsumption = Double.parseDouble(vehicleInfo[2]);
            double tankCapacity = Double.parseDouble(vehicleInfo[3]);

            if (vehicleType.equals("Car")) {
                vehicles.put(vehicleType, new Car(vehicleFuelQuantity, vehicleFuelConsumption, tankCapacity));
            } else if (vehicleType.equals("Truck")) {
                vehicles.put(vehicleType, new Truck(vehicleFuelQuantity, vehicleFuelConsumption, tankCapacity));
            } else if (vehicleType.equals("Bus")) {
                vehicles.put(vehicleType, new Bus(vehicleFuelQuantity, vehicleFuelConsumption, tankCapacity));
            }
        }
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandInput = scanner.nextLine().split("\\s+");
            String vehicleType = commandInput[1];
            String command = commandInput[0];
            if (command.equals("Drive")) {
                double distance = Double.parseDouble(commandInput[2]);
                System.out.println(vehicles.get(vehicleType).drive(distance));
            } else if (command.equals("Refuel")) {
                double litters = Double.parseDouble(commandInput[2]);
                vehicles.get(vehicleType).refuel(litters);
            } else if (command.equals("DriveEmpty")) {
                double distance = Double.parseDouble(commandInput[2]);
                Bus bus = (Bus) vehicles.get("Bus");
                System.out.println(bus.drive(distance));
            }
        }

        vehicles.values().forEach(System.out::println);
    }
}
