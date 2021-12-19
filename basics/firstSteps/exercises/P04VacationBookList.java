package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P04VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageNum = scanner.nextInt();
        int pagePerHour = scanner.nextInt();
        int days = scanner.nextInt();

        int hoursPerDay = (pageNum / pagePerHour) / days;
        System.out.println(hoursPerDay);

    }
}
