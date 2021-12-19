package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalCost = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    totalCost = days * 45000;
                    totalCost -= totalCost * 0.3;
                } else if (season.equals("Summer")){
                    totalCost = days * 40000;
                    totalCost -= totalCost * 0.3;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    totalCost = days * 17000;
                    totalCost += totalCost * 0.25;
                } else if (season.equals("Summer")){
                    totalCost = days * 12500;
                    totalCost += totalCost * 0.25;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    totalCost = days * 24000;
                } else if (season.equals("Summer")){
                    totalCost = days * 20250;
                }
                break;
        }
        if (totalCost <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalCost);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalCost - budget);
        }
    }
}
