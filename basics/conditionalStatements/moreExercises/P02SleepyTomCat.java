package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int playTime = (holidays * 127) + ((365 - holidays) * 63);

        if(playTime <= 30000) {
            int minutesToPlay = 30000 - playTime;
            int hours = minutesToPlay / 60;
            int minutes = minutesToPlay % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            int minutesLessToPlay = playTime - 30000;
            int hours = minutesLessToPlay / 60;
            int minutes = minutesLessToPlay % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
