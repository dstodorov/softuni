package SoftUni.basics.firstSteps.moreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // House
        double frontWallSqMeters = (x * x) - (1.2 * 2);
        double backWallSqMeters = x * x;
        double sideWallsSqMeters = 2 * ((x * y) - (1.5 * 1.5));
        double totalHouseSqMeters = frontWallSqMeters + backWallSqMeters + sideWallsSqMeters;

        //Roof
        double roofSidesSqMeters = 2 * (x * y);
        double roofFrontBackSidesSqMeters = 2 * (x * h / 2);
        double roofTotalSqMeters = roofSidesSqMeters + roofFrontBackSidesSqMeters;

        //Total liters
        double greenPaintLitters = totalHouseSqMeters / 3.4;
        double redPaint = roofTotalSqMeters / 4.3;

        System.out.printf("%.2f\n", greenPaintLitters);
        System.out.printf("%.2f", redPaint);
    }
}
