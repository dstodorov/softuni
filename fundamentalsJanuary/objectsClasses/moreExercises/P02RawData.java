package SoftUni.fundamentalsJanuary.objectsClasses.moreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02RawData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carDetails = scanner.nextLine().split(" ");

            String carModel = carDetails[0];

            int engineSpeed = Integer.parseInt(carDetails[1]);
            int enginePower = Integer.parseInt(carDetails[2]);

            int cargoWeight = Integer.parseInt(carDetails[3]);
            String cargoType = carDetails[4];

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tire> tires = new ArrayList<>();
            addTires(tires, carDetails);

            cars.add(new Car(carModel, engine, cargo, tires));
        }

        String cargoType = scanner.nextLine();

        if (cargoType.equals("fragile")) {
            List<Car> carsWithFragileCargo = cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile") && car.hasTiresWithBadPressure()).collect(Collectors.toList());
            printCars(carsWithFragileCargo);
        } else if (cargoType.equals("flamable")) {
            List<Car> carsWithFlammableCargo = cars.stream().filter(car -> car.getCargo().getCargoType().equals("flamable") && car.getEngine().getEnginePower() > 250).collect(Collectors.toList());
            printCars(carsWithFlammableCargo);
        }

    }

    private static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getModel());
        }
    }

    private static void addTires(List<Tire> tires, String[] carDetails) {
        for (int i = 5; i <= 12; i += 2) {
            tires.add(new Tire(Double.parseDouble(carDetails[i]), Integer.parseInt(carDetails[i + 1])));
        }
    }

    static class Car {

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        }

        public String getModel() {
            return model;
        }

        private String model;

        public Engine getEngine() {
            return engine;
        }

        private Engine engine;

        public Cargo getCargo() {
            return cargo;
        }

        private Cargo cargo;
        private List<Tire> tires;

        public List<Tire> getTires() {
            return tires;
        }

        public boolean hasTiresWithBadPressure() {
            for (Tire tire : this.tires) {
                if (tire.getTirePressure() < 1) return true;
            }
            return false;
        }


    }


    private static class Engine {
        private int engineSpeed;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getEnginePower() {
            return enginePower;
        }

        private int enginePower;
    }

    private static class Cargo {
        private int cargoWeight;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }

        public String getCargoType() {
            return cargoType;
        }

        private String cargoType;
    }

    private static class Tire {

        public double getTirePressure() {
            return tirePressure;
        }

        private double tirePressure;
        private int tireAge;

        public Tire(double tirePressure, int tireAge) {
            this.tirePressure = tirePressure;
            this.tireAge = tireAge;
        }
    }
}