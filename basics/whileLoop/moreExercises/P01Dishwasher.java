package SoftUni.basics.whileLoop.moreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int totalDetergentMl = bottles * 750;
        int usedDetergentMl = 0;
        int washesCounter = 1;
        int washedDishes = 0;
        int washedPots = 0;

        while (true) {
            String dishes = scanner.nextLine();
            if (dishes.equals("End")) {
                break;
            } else {
                if (washesCounter < 3) {
                    washesCounter++;
                    usedDetergentMl += Integer.parseInt(dishes) * 5;
                    washedDishes += Integer.parseInt(dishes);
                } else {
                    washesCounter = 1;
                    usedDetergentMl += Integer.parseInt(dishes) * 15;
                    washedPots += Integer.parseInt(dishes);
                }
                if (usedDetergentMl > totalDetergentMl) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", usedDetergentMl - totalDetergentMl);
                    break;
                }
            }
        }
        if (usedDetergentMl <= totalDetergentMl) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", washedDishes, washedPots);
            System.out.printf("Leftover detergent %d ml.%n", totalDetergentMl - usedDetergentMl);
        }
    }
}
