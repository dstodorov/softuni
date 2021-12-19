package SoftUni.basics.conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Tuesday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Wednesday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Thursday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Friday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Saturday": {
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                }
                else {
                    System.out.println("closed");
                }
                break;
            }
            case "Sunday": {
                System.out.println("closed");
                break;
            }
            default: {
                System.out.println("error");
                break;
            }
        }
    }
}
