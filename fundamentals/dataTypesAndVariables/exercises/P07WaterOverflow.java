package SoftUni.fundamentals.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalLitters = 0;
        int tankCapacity = 255;
        for (int i = 1; i <= n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (litters + totalLitters > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitters += litters;
            }
            if (totalLitters > tankCapacity){
                totalLitters = 255;
            }
        }
        System.out.println(totalLitters);
    }
}
