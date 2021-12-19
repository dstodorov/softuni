package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(minutes + 15 > 59) {
            hour++;
            if (hour > 23) hour = 0;
            minutes = minutes + 15 - 60;

        } else {
            minutes += 15;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
