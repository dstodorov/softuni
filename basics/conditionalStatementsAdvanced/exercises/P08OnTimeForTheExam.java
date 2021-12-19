package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int examTimeInMinutes = examHour * 60 + examMinutes;
        int arriveTimeInMinutes = arriveHour * 60 + arriveMinutes;

        if (examTimeInMinutes == arriveTimeInMinutes) {
            System.out.println("On time");
        }

        if (arriveTimeInMinutes < examTimeInMinutes) {
            int difference = examTimeInMinutes - arriveTimeInMinutes;
            if ((examTimeInMinutes - arriveTimeInMinutes) <= 30) {
                System.out.println("On time");
            } else {
                System.out.println("Early");
            }
            if (difference >= 60) {
                int h = difference / 60;
                int m = difference % 60;
                System.out.printf("%d:%02d hours before the start", h,m);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        }
        if (arriveTimeInMinutes > examTimeInMinutes) {
            System.out.println("Late");
            int difference = arriveTimeInMinutes - examTimeInMinutes;
            if (difference >= 60) {
                int h = difference / 60;
                int m = difference % 60;
                System.out.printf("%d:%02d hours after the start", h,m);
            } else {
                System.out.printf("%d minutes after the start", difference);
            }
        }
    }
}
