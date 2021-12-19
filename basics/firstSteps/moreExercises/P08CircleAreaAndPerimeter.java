package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double circlePerimeter = 2 * Math.PI * r;
        double circleFace = Math.PI * r * r;

        System.out.printf("%.2f\n", circleFace);
        System.out.printf("%.2f", circlePerimeter);
    }
}
