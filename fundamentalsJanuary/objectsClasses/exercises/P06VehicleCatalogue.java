package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicleCatalog = new ArrayList<>();

        while (!input.equals("End")) {
            String[] vehicleDetails = input.split(" ");

            String typeOfVehicle = vehicleDetails[0];
            String modelOfVehicle = vehicleDetails[1];
            String colorOfVehicle = vehicleDetails[2];
            int horsepowerOfVehicle = Integer.parseInt(vehicleDetails[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
            vehicleCatalog.add(vehicle);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            String model = input;

            printVehicleData(vehicleCatalog, model);

            input = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHorsepower(vehicleCatalog, "car"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n", getAverageHorsepower(vehicleCatalog, "truck"));
    }

    private static Double getAverageHorsepower(List<Vehicle> vehicleCatalog, String type) {
        double average = 0;
        if (type.equals("car")) {
            average = getCarsAverage(vehicleCatalog);
        } else if (type.equals("truck")) {
            average = getTrucksAverage(vehicleCatalog);
        }

        return average;
    }

    private static double getTrucksAverage(List<Vehicle> vehicleCatalog) {
        int count = 0;
        double totalHorsepower = 0;
        for (Vehicle v : vehicleCatalog) {
            if (v.getType().equals("truck")) {
                count++;
                totalHorsepower += v.getHorsepower();
            }
        }
        if (count > 0) {
            return totalHorsepower / count;
        }
        return 0;
    }

    private static double getCarsAverage(List<Vehicle> vehicleCatalog) {
        int count = 0;
        double totalHorsepower = 0;
        for (Vehicle v : vehicleCatalog) {
            if (v.getType().equals("car")) {
                count++;
                totalHorsepower += v.getHorsepower();
            }
        }

        if (count > 0) {
            return totalHorsepower / count;
        }
        return 0;
    }

    private static void printVehicleData(List<Vehicle> vehicleCatalog, String model) {
        for (Vehicle v : vehicleCatalog) {
            if (v.getModel().equals(model)) {
                char typeFirstLetter = Character.toUpperCase(v.getType().charAt(0));
                String typeSecondPart = v.getType().substring(1);
                char modelFirstLetter = Character.toUpperCase(v.getModel().charAt(0));
                String modelSecondPart = v.getModel().substring(1);
                System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n", typeFirstLetter + typeSecondPart, modelFirstLetter + modelSecondPart, v.getColor(), v.getHorsepower());
            }
        }
    }

    private static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String getType() {
            return type;
        }


        public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
            this.type = typeOfVehicle;
            this.model = modelOfVehicle;
            this.color = colorOfVehicle;
            this.horsepower = horsepowerOfVehicle;
        }
    }
}
