package SoftUni.fundamentalsJanuary.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int totalLitters = 0;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (tankCapacity >= litters) {
                totalLitters += litters;
                tankCapacity -= litters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLitters);
    }
}
