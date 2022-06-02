package SoftUni.advancedMay.definingClasses.lab.carInfo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            cars[i] = new Car();
            cars[i].setBrand(carInfo[0]);
            cars[i].setModel(carInfo[1]);
            cars[i].setHorsePower(Integer.parseInt(carInfo[2]));
        }

        Arrays.stream(cars).forEach(car -> System.out.print(car.carInfo()));

    }
}
