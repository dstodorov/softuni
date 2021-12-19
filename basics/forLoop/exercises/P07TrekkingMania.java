package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int climbers = Integer.parseInt(scanner.nextLine());
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        double totalClimbers = 0;

        for (int i = 0; i < climbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 5) p1 += number;
            if (number >= 6 && number <= 12) p2 += number;
            if (number >= 13 && number <= 25) p3 += number;
            if (number >= 26 && number <= 40) p4 += number;
            if (number >= 41) p5 += number;
            totalClimbers += number;
        }

        System.out.printf("%.2f%%%n", (p1 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (p2 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (p3 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (p4 / totalClimbers) * 100);
        System.out.printf("%.2f%%", (p5 / totalClimbers) * 100);
    }
}
