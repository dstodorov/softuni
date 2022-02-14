package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int employeeOneEfficiency = Integer.parseInt(scanner.nextLine());
        int employeeTwoEfficiency = Integer.parseInt(scanner.nextLine());
        int employeeThreeEfficiency = Integer.parseInt(scanner.nextLine());
        int totalStudents = Integer.parseInt(scanner.nextLine());

        int totalEfficiencyPerHour = employeeOneEfficiency + employeeTwoEfficiency + employeeThreeEfficiency;

        int hoursNeeded = 0;

        while (totalStudents > 0) {
            totalStudents -= totalEfficiencyPerHour;
            hoursNeeded++;
            if (hoursNeeded % 4 == 0) hoursNeeded++;
        }

        System.out.printf("Time needed: %dh.", hoursNeeded);

    }
}
