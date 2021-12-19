package SoftUni.basics.conditionalStatements.exercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double VIDEO_PRICE = 250;

        double budget = Double.parseDouble(scanner.nextLine());
        int video_cards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int memory = Integer.parseInt(scanner.nextLine());

        double CPU_PRICE = 0.35 * (video_cards * VIDEO_PRICE);
        double RAM_PRICE = 0.1 * (video_cards * VIDEO_PRICE);

        double totalCost = (video_cards * VIDEO_PRICE) + (cpu * CPU_PRICE) + (memory * RAM_PRICE);

        if (video_cards > cpu) {
            totalCost *= 0.85;
        }

        if(totalCost <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalCost - budget);
        }
    }
}
