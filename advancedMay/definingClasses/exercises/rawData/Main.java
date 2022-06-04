package SoftUni.advancedMay.definingClasses.exercises.rawData;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            double tire1pressure = Double.parseDouble(carInfo[5]);
            int tire1age = Integer.parseInt(carInfo[6]);
            double tire2pressure = Double.parseDouble(carInfo[7]);
            int tire2age = Integer.parseInt(carInfo[8]);
            double tire3pressure = Double.parseDouble(carInfo[9]);
            int tire3age = Integer.parseInt(carInfo[10]);
            double tire4pressure = Double.parseDouble(carInfo[11]);
            int tire4age = Integer.parseInt(carInfo[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire[] tires = new Tire[4];
            tires[0] = new Tire(tire1age, tire1pressure);
            tires[1] = new Tire(tire2age, tire2pressure);
            tires[2] = new Tire(tire3age, tire3pressure);
            tires[3] = new Tire(tire4age, tire4pressure);

            cars.put(model, new Car(model, engine, cargo, tires));
        }

        String command = scanner.nextLine();

        switch (command) {
            case "fragile":
                cars.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue()
                                .getCargo()
                                .getCargoType()
                                .equals("fragile"))
                        .collect(Collectors.toList())
                        .stream()
                        .filter(c -> Arrays.stream(c.getValue().getTires()).anyMatch(t -> t.getTirePressure() < 1))
                        .forEach(car -> System.out.println(car.getKey()));
                break;
            case "flamable":
                cars.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue()
                                .getCargo()
                                .getCargoType()
                                .equals("flamable"))
                        .collect(Collectors.toList())
                        .stream()
                        .filter(c -> c.getValue().getEngine().getEnginePower() > 250)
                        .forEach(car -> System.out.println(car.getKey()));
                break;
        }
    }
}
