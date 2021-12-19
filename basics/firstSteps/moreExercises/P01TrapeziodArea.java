package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float b1 = Float.parseFloat(scanner.nextLine());
        float b2 = Float.parseFloat(scanner.nextLine());
        float h = Float.parseFloat(scanner.nextLine());

        float area = (b1 + b2) * h / 2;
        System.out.printf("%.2f", area);
    }
}
