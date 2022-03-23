package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P13BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxStudentAttendances = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double currentStudentBonus = (double) studentAttendances / numberOfLectures * (5 + bonus);
            if (currentStudentBonus > maxBonus) {
                maxBonus = currentStudentBonus;
                maxStudentAttendances = studentAttendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.%n", maxStudentAttendances);
    }
}

