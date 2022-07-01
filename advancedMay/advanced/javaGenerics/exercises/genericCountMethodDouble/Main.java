package SoftUni.advancedMay.advanced.javaGenerics.exercises.genericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<Double> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            box.getElements().add(Double.parseDouble(scanner.nextLine()));
        }

        Double comparedElement = Double.parseDouble(scanner.nextLine());

        System.out.println(box.getGreaterElements(comparedElement));
    }
}
