package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float s = Float.parseFloat(scanner.nextLine());
        float h = Float.parseFloat(scanner.nextLine());
        float area = s * h / 2;

        System.out.printf("%.02f", area);
    }
}
