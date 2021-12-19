package SoftUni.basics.conditionalStatements.lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            float a = Float.parseFloat(scanner.nextLine());
            System.out.printf("%.3f", (a * a));
        } else if (figure.equals("rectangle")) {
            float a = Float.parseFloat(scanner.nextLine());
            float b = Float.parseFloat(scanner.nextLine());
            System.out.printf("%.3f", (a * b));
        } else if (figure.equals("circle")) {
            float r = Float.parseFloat(scanner.nextLine());
            System.out.printf("%.3f", (Math.PI * r * r));
        } else if (figure.equals("triangle")) {
            float a = Float.parseFloat(scanner.nextLine());
            float h = Float.parseFloat(scanner.nextLine());
            System.out.printf("%.3f", (0.5 * a * h));
        }
    }
}
