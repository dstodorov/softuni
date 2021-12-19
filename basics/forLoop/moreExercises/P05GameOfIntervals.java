package SoftUni.basics.forLoop.moreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervals = Integer.parseInt(scanner.nextLine());
        double totalScore = 0;
        int totalNumbers = 0;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;
        int score5 = 0;
        int score6 = 0;

        for (int i = 0; i < intervals; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            boolean isInvalid = number < 0 || number > 50;

            if(!isInvalid) {
                if (number <= 9) {
                    totalScore += 0.2 * number;
                    score1++;
                } else if (number <= 19) {
                    totalScore += 0.3 * number;
                    score2++;
                } else if (number <= 29) {
                    totalScore += 0.4 * number;
                    score3++;
                } else if (number <= 39) {
                    totalScore += 50;
                    score4++;
                } else {
                    totalScore += 100;
                    score5++;
                }
            } else {
                totalScore /= 2;
                score6++;
            }
            totalNumbers++;
        }

        System.out.printf("%.2f%n", totalScore);
        System.out.printf("From 0 to 9: %.2f%%%n", 1.0 * score1 / totalNumbers * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", 1.0 * score2 / totalNumbers * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", 1.0 * score3 / totalNumbers * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", 1.0 * score4 / totalNumbers * 100);
        System.out.printf("From 40 to 50: %.2f%%%n",1.0 * score5/ totalNumbers * 100);
        System.out.printf("Invalid numbers: %.2f%%%n",1.0 * score6 / totalNumbers * 100);
    }
}
