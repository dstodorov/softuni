package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P01UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
