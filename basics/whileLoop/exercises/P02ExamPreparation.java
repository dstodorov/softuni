package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badScores = Integer.parseInt(scanner.nextLine());
        int totalGrades = 0;
        double sumGrades = 0;
        String lastProblemName = "";
        int totalBadScores = 0;

        while (true) {
            String problemName = scanner.nextLine();
            int grade = 0;

            if (problemName.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", sumGrades / totalGrades);
                System.out.printf("Number of problems: %d%n", totalGrades);
                System.out.printf("Last problem: %s%n", lastProblemName);
                break;
            } else {
                grade = Integer.parseInt(scanner.nextLine());
                lastProblemName = problemName;
                sumGrades+= grade;
                totalGrades++;
            }


            if (grade <= 4) {
                totalBadScores ++;
            }
            if (totalBadScores == badScores) {
                System.out.printf("You need a break, %d poor grades.", totalBadScores);
                break;
            }

        }
    }
}
