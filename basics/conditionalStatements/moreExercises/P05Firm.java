package SoftUni.basics.conditionalStatements.moreExercises;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double actualHours = ((days - (days * 0.1)) * 8) + (workers * days * 2);

        if (actualHours >= hoursNeeded) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(actualHours - hoursNeeded));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(hoursNeeded - actualHours));
        }
    }
}
