package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P08TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int finalScore = Integer.parseInt(scanner.nextLine());
        int tournamentsWon = 0;
        int initialScore = finalScore;

        for (int i = 0; i < tournaments; i++) {
            String tournamentResult = scanner.nextLine();

            if (tournamentResult.equals("W")) {
                finalScore += 2000;
                tournamentsWon++;
            }
            if (tournamentResult.equals("F")) finalScore += 1200;
            if (tournamentResult.equals("SF")) finalScore += 720;
        }

        System.out.printf("Final points: %d%n", finalScore);
        System.out.printf("Average points: %d%n", (finalScore - initialScore)/tournaments);
        System.out.printf("%.2f%%", ((tournamentsWon * 1.0) / tournaments) * 100);
    }
}
