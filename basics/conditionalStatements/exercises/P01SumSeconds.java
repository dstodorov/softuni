package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFist = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int sum = timeFist + timeSecond + timeThird;
        if (sum >= 60) {
            int minutes = sum / 60;
            int reminder = sum % 60;
            System.out.printf("%d:%02d", minutes, reminder);
        } else {
            System.out.printf("0:%02d", sum);
        }
    }
}
