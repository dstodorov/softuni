package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int totalSeats = rows * columns;

        if (type.equals("Premiere")) {
            System.out.printf("%.2f leva", totalSeats * 12.00);
        }
        if (type.equals("Normal")) {
            System.out.printf("%.2f", totalSeats * 7.50);
        }
        if (type.equals("Discount")) {
            System.out.printf("%.2f", totalSeats * 5.00);
        }


    }
}
