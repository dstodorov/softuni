package SoftUni.basics.conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int totalFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double discount = 0.0;
        double priceIncrease = 0.0;
        double flowerCost = 0.0;


        switch (flowersType) {
            case "Roses": {
                flowerCost = 5.0;
                if (totalFlowers > 80) discount = 0.1;
                break;
            }
            case "Dahlias": {
                flowerCost = 3.8;
                if (totalFlowers > 90) discount = 0.15;
                break;
            }
            case "Tulips": {
                flowerCost = 2.8;
                if (totalFlowers > 80) discount = 0.15;
                break;
            }
            case "Narcissus": {
                flowerCost = 3.0;
                if (totalFlowers < 120) priceIncrease = 0.15;
                break;
            }
            case "Gladiolus": {
                flowerCost = 2.5;
                if (totalFlowers < 80) priceIncrease = 0.2;
                break;
            }
        }

        double totalCost = totalFlowers * flowerCost;
        totalCost -= totalCost * discount;
        totalCost += totalCost * priceIncrease;

        if (totalCost <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", totalFlowers, flowersType, budget - totalCost);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalCost - budget);
        }
    }
}
