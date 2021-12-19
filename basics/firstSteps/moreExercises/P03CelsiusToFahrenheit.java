package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float celsius = Float.parseFloat(scanner.nextLine());
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
