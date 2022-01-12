package SoftUni.fundamentalsJanuary.basicSyntax.lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (dayType) {
            case "Holiday":
            case "Weekend":
        }

        if (dayType.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                System.out.printf("%d$", 12);
            } else if (age > 18 && age <= 64) {
                System.out.printf("%d$", 18);
            } else if (age > 64 && age <= 122) {
                System.out.printf("%d$", 12);
            } else {
                System.out.println("Error!");
            }
        } else if (dayType.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                System.out.printf("%d$", 15);
            } else if (age > 18 && age <= 64) {
                System.out.printf("%d$", 20);
            } else if (age > 64 && age <= 122) {
                System.out.printf("%d$", 15);
            } else {
                System.out.println("Error!");
            }
        } else if (dayType.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                System.out.printf("%d$", 5);
            } else if (age > 18 && age <= 64) {
                System.out.printf("%d$", 12);
            } else if (age > 64 && age <= 122) {
                System.out.printf("%d$", 10);
            } else {
                System.out.println("Error!");
            }
        }
    }
}
