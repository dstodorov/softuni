package SoftUni.fundamentals.arrays.lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(days[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
