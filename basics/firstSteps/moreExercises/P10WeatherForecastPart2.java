package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temp = Float.parseFloat(scanner.nextLine());

        if (temp >= 26.00 && temp <= 35.00) {
            System.out.println("Hot");
        } else if (temp >= 20.1 && temp <= 25.9) {
            System.out.println("Warm");
        } else if (temp >= 15.00 && temp <= 20.00) {
            System.out.println("Mild");
        } else if (temp >= 12.00 && temp <= 14.9) {
            System.out.println("Cool");
        } else if (temp >= 5.00 && temp <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
