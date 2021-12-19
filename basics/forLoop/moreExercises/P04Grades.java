package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double n = 0;

        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            n += grade;
            if (grade >= 2 && grade <= 2.99) {
                g1++;
            } else if (grade >= 3 && grade <= 3.99) {
                g2++;
            } else if (grade >= 4 && grade <= 4.99) {
                g3++;
            } else if (grade >= 5) {
                g4++;
            }
        }

        System.out.printf("Top students: %.2f%%%n", (1.0 * g4) / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",(1.0 * g3) / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",(1.0 * g2) / students * 100);
        System.out.printf("Fail: %.2f%%%n",(1.0 * g1) / students * 100);
        System.out.printf("Average: %.2f", n / students);
    }
}
