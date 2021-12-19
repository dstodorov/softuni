package SoftUni.fundamentals.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        double numberTwo = Double.parseDouble(scanner.nextLine());
        double diff = numberOne - numberTwo;
        double eps = 0.000001;
        if (Math.abs(diff) > eps) System.out.println("False");
        else System.out.println("True");
    }
}
