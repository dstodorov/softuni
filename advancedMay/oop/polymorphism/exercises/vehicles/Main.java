package SoftUni.advancedMay.oop.polymorphism.exercises.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");

        double carFuelQuantity = Double.parseDouble(carInfo[1]);
        double carFuelConsumptionPerKm = Double.parseDouble(carInfo[2]);
        Vehicle car = new Car(carFuelQuantity, carFuelConsumptionPerKm);

        String[] truckInfo = scanner.nextLine().split("\\s+");

        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckFuelConsumptionPerKm = Double.parseDouble(truckInfo[2]);
        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumptionPerKm);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandParams = scanner.nextLine().split("\\s+");
            String command = commandParams[0];
            String vehicleType = commandParams[1];

            if (command.equals("Drive")) {
                double distance = Double.parseDouble(commandParams[2]);
                if (vehicleType.equals("Car")) {
                    car.drive(distance);
                } else if (vehicleType.equals("Truck")) {
                    truck.drive(distance);
                }
            } else if (command.equals("Refuel")) {
                double litters = Double.parseDouble(commandParams[2]);
                if (vehicleType.equals("Car")) {
                    car.refuel(litters);
                } else if (vehicleType.equals("Truck")) {
                    truck.refuel(litters);
                }
            }

        }

        System.out.println(car);
        System.out.println(truck);
    }
}
