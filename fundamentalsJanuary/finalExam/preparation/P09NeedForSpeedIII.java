package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carDetails = scanner.nextLine().split("\\|");
            cars.put(carDetails[0], new Car(carDetails[0], Integer.parseInt(carDetails[1]), Integer.parseInt(carDetails[2])));
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] inputCommands = input.split(" : ");

            String car = inputCommands[1];
            Car currentCar = cars.get(car);

            switch (inputCommands[0]) {
                case "Drive": {
                    int distance = Integer.parseInt(inputCommands[2]);
                    int fuel = Integer.parseInt(inputCommands[3]);

                    if (currentCar.getFuel() >= fuel) {
                        currentCar.setMileage(currentCar.getMileage() + distance);
                        currentCar.setFuel(currentCar.getFuel() - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if (currentCar.getMileage() > 100000) {
                        cars.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                }
                case "Refuel": {
                    int fuel = Integer.parseInt(inputCommands[2]);
                    int refueledLitters = 0;
                    if (currentCar.getFuel() + fuel > 75) {
                        refueledLitters = 75 - currentCar.getFuel();
                        currentCar.setFuel(75);
                    } else {
                        currentCar.setFuel(currentCar.getFuel() + fuel);
                        refueledLitters = fuel;
                    }

                    System.out.printf("%s refueled with %d liters%n", car, refueledLitters);
                    break;
                }
                case "Revert": {
                    int kilometers = Integer.parseInt(inputCommands[2]);

                    currentCar.setMileage(currentCar.getMileage() - kilometers);

                    if (currentCar.getMileage() < 10000) {
                        currentCar.setMileage(10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Car> carInfo : cars.entrySet()) {
            Car car = carInfo.getValue();
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carInfo.getKey(), car.getMileage(), car.getFuel());
        }
    }

    private static class Car {
        private String car;
        private int mileage;

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        private int fuel;

        private Car(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }
    }
}
