package SoftUni.advancedMay.advanced.definingClasses.exercises.carSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);
            String displacement = "n/a";
            String efficiency = "n/a";
            if (engineInfo.length == 3) {
                try {
                    int temp = Integer.parseInt(engineInfo[2]);
                    displacement = engineInfo[2];
                } catch (NumberFormatException e) {
                    efficiency = engineInfo[2];
                }
            } else if (engineInfo.length == 4) {
                displacement = engineInfo[2];
                efficiency = engineInfo[3];
            }
            engines.put(model, new Engine(model, power, displacement, efficiency));
        }
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] carDetails = scanner.nextLine().split("\\s+");
            String model = carDetails[0];
            Engine engine = engines.get(carDetails[1]);
            String weight = "n/a";
            String color = "n/a";
            if (carDetails.length == 3) {
                try {
                    int temp = Integer.parseInt(carDetails[2]);
                    weight = carDetails[2];
                } catch (NumberFormatException e) {
                    color = carDetails[2];
                }
            } else if (carDetails.length == 4) {
                weight = carDetails[2];
                color = carDetails[3];
            }
            cars.add(new Car(model, engine, weight, color));
        }

        cars.forEach(System.out::print);
    }
}
