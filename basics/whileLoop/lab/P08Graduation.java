package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notPassed = 0;
        int year = 1;
        double finalGrade = 0;

        String name = scanner.nextLine();

        while (true) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                notPassed++;
            }

            if (notPassed > 1) {
                System.out.printf("%s has been excluded at %d grade",name , year - 1);
                break;
            }
            year++;
            finalGrade += grade;
            if (year > 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, finalGrade / 12);
                break;
            }
        }
    }
}
