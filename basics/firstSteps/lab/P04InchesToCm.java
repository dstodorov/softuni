package SoftUni.basics.firstSteps.lab;

import java.util.Scanner;

public class P04InchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inches = scanner.nextFloat();

        System.out.println(inches * 2.54);
    }
}
