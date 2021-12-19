package SoftUni.basics.exam.examPreparetion;

import java.util.Scanner;

public class P05EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerOneEggs = Integer.parseInt(scanner.nextLine());
        int playerTwoEggs = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                playerTwoEggs -= 1;
            } else if (input.equals("two")) {
                playerOneEggs -= 1;
            }
            if (playerOneEggs == 0 || playerTwoEggs == 0) break;
            input = scanner.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", playerOneEggs);
            System.out.printf("Player two has %d eggs left.", playerTwoEggs);
        }

        if (playerOneEggs == 0) System.out.printf("Player one is out of eggs. Player two has %d eggs left.", playerTwoEggs);
        else if (playerTwoEggs == 0) System.out.printf("Player two is out of eggs. Player one has %d eggs left.", playerOneEggs);
    }
}
