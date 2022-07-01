package SoftUni.advancedMay.advanced.definingClasses.lab.constructors;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            if (carInfo.length == 1) {
                cars[i] = new Car(carInfo[0]);
            } else {
                cars[i] = new Car(carInfo[0], carInfo[1], Integer.parseInt(carInfo[2]));
            }
        }

        Arrays.stream(cars).forEach(car -> System.out.println(car.carInfo()));
    }
}
