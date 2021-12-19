package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tabs; i++) {
            String page = scanner.nextLine();

            if (page.equals("Facebook")) salary -= 150;
            if (page.equals("Instagram")) salary -= 100;
            if (page.equals("Reddit")) salary -= 50;

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) System.out.println(salary);
    }
}
