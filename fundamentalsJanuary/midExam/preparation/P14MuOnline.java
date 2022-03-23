package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.Scanner;

public class P14MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;
        boolean died = false;

        String[] dungeon = getRooms(scanner);

        for (int i = 0; i < dungeon.length; i++) {
            String[] commands = dungeon[i].split(" ");
            String command = commands[0];
            bestRoom++;
            int number = Integer.parseInt(commands[1]);
            int healedPoints = 0;
            if (command.equals("potion")) {
                if (health + number >= 100){
                    healedPoints = 100 - health;
                    health = 100;
                }
                else{
                    healedPoints = number;
                    health += number;
                }
                System.out.printf("You healed for %d hp.%n", healedPoints);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                String monster = command;
                health -= number;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d%n", bestRoom);
                    died = true;
                    break;
                }
            }
        }

        if (!died) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }

    }

    private static String[] getRooms(Scanner scanner) {
        return scanner.nextLine().split("\\|");
    }
}

