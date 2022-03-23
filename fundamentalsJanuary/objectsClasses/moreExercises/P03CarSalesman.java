package SoftUni.fundamentalsJanuary.objectsClasses.moreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03CarSalesman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int engineCount = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < engineCount; i++) {
            String[] engineDetails = scanner.nextLine().split(" ");

            String model = engineDetails[0];
            int power = Integer.parseInt(engineDetails[1]);
            String displacement = "n/a";
            String efficiency = "n/a";
            try {
                efficiency = engineDetails[2];
                int tempDisplacement = Integer.parseInt(engineDetails[2]);
                displacement = engineDetails[2];
                efficiency = "n/a";
                efficiency = engineDetails[3];
            } catch (Exception e) {}

            engineList.add(new Engine(model, power, displacement, efficiency));
            //System.out.printf("%s %d %s %s%n", model, power, displacement, efficiency);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] carDetails = scanner.nextLine().split(" ");

            String model = carDetails[0];
            Engine engine = getEngineReference(engineList, carDetails[1]);
            String weight = "n/a";
            String color = "n/a";
            try {
                color = carDetails[2];
                int tempWeight = Integer.parseInt(carDetails[2]);
                weight = carDetails[2];
                color = "n/a";
                color = carDetails[3];
            } catch (Exception e){}

            carList.add(new Car(model, engine, weight, color));
        }

        printCars(carList);
    }

    private static void printCars(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    private static Engine getEngineReference(List<Engine> engineList, String engineModel) {
        for (Engine engine : engineList) {
            if (engine.getModel().equals(engineModel)) {
                return engine;
            }
        }
        return null;
    }

    static class Car {
        private String model;
        private Engine engine;
        private String weight;
        private String color;

        public Car(String model, Engine engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format(
                    "%s:\n" +
                    "  %s:\n" +
                    "    Power: %d\n" +
                    "    Displacement: %s\n" +
                    "    Efficiency: %s\n" +
                    "  Weight: %s\n" +
                    "  Color: %s",
                    this.model,
                    this.engine.getModel(),
                    this.engine.getPower(),
                    this.engine.getDisplacement(),
                    this.engine.getEfficiency(),
                    this.weight,
                    this.color);
        }
    }


    static class Engine {
        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }

        private String model;
        private int power;
        private String displacement;

        public Engine(String model, int power, String displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        private String efficiency;
    }
}
