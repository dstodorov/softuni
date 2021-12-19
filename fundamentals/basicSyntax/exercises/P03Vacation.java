package SoftUni.fundamentals.basicSyntax.exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double costPerDay = 0;
        double discount = 0;
        double totalCost = 0;


        switch (groupType) {
            case "Students":
                if (dayType.equals("Friday")) {
                    costPerDay = 8.45;
                } else if (dayType.equals("Saturday")) {
                    costPerDay = 9.80;
                } else if (dayType.equals("Sunday")) {
                    costPerDay = 10.46;
                }
                if (numberOfPeople >= 30) discount = 0.15;
                break;
            case "Business":
                if (dayType.equals("Friday")) {
                    costPerDay = 10.90;
                } else if (dayType.equals("Saturday")) {
                    costPerDay = 15.60;
                } else if (dayType.equals("Sunday")) {
                    costPerDay = 16;
                }
                if (numberOfPeople >= 100) numberOfPeople -= 10;
                break;
            case "Regular":
                if (dayType.equals("Friday")) {
                    costPerDay = 15;
                } else if (dayType.equals("Saturday")) {
                    costPerDay = 20;
                } else if (dayType.equals("Sunday")) {
                    costPerDay = 22.50;
                }
                if (numberOfPeople >= 10) discount = 0.05;
                break;
        }

        totalCost = numberOfPeople * costPerDay;
        totalCost -= totalCost * discount;
        System.out.printf("Total price: %.2f", totalCost);
    }
}
