package SoftUni.advancedMay.definingClasses.exercises.speedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] carInformation = scanner.nextLine().split("\\s+");
            String model = carInformation[0];
            int fuelAmount = Integer.parseInt(carInformation[1]);
            double fuelCostPerKm = Double.parseDouble(carInformation[2]);
            cars.put(model, new Car(model, fuelAmount, fuelCostPerKm));
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String model = input.split("\\s+")[1];
            int distance = Integer.parseInt(input.split("\\s+")[2]);
            Car car = cars.get(model);
            if (car.hasFuel(distance)) {
                car.drive(distance);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            input = scanner.nextLine();
        }

        cars.forEach((model, car) -> System.out.printf("%s %.2f %d%n", car.getModel(), car.getFuelAmount(), car.getDistanceTraveled()));
    }
}
