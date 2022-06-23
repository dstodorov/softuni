package SoftUni.advancedMay.examPreparation.exam06;

import java.util.Scanner;

public class P02Python {
    private static int snakePosX;
    private static int snakePosY;
    private static int foodNeeded;
    private static int foodCollected;
    private static boolean foundEnemy = false;
    private static int pythonLength = 1;
    private static boolean foodWasHit = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int commandsExecuted = 0;

        char[][] screen = new char[size][size];
        String[] commands = scanner.nextLine().split(",\\s+");

        for (int row = 0; row < screen.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < line.length; col++) {
                screen[row][col] = line[col].charAt(0);
                if (line[col].charAt(0) == 's') {
                    snakePosX = row;
                    snakePosY = col;
                }
                if (line[col].charAt(0) == 'f') foodNeeded++;
            }
        }


        for (String command : commands) {
            switch (command) {
                case "up":
                    if (snakePosX - 1 < 0) {
                        move(screen, size - 1, 0);
                    } else {
                        move(screen, -1, 0);
                    }
                    break;
                case "down":
                    if (snakePosX + 1 > screen.length - 1) {
                        move(screen, -snakePosX, 0);
                    } else {
                        move(screen, 1, 0);
                    }
                    break;
                case "left":
                    if (snakePosY - 1 < 0) {
                        move(screen, 0, size - 1);
                    } else {
                        move(screen, 0, -1);
                    }
                    break;
                case "right":
                    if (snakePosY + 1 > screen.length - 1) {
                        move(screen, 0, -snakePosY);
                    } else {
                        move(screen, 0, 1);
                    }
                    break;
            }

            commandsExecuted++;
            if (foundEnemy) break;
            if (foodCollected == foodNeeded) break;
        }

        if (foodNeeded == foodCollected) {
            System.out.println("You win! Final python length is " + pythonLength);
        } else if (commandsExecuted == commands.length && !foundEnemy) {
            System.out.println("You lose! There is still " + (foodNeeded - foodCollected) + " food to be eaten.");
        }
        if (foundEnemy) {
            System.out.println("You lose! Killed by an enemy!");
        }
    }

    private static void move(char[][] screen, int rowMutator, int colMutator) {
        int nextRow = snakePosX + rowMutator;
        int nextCol = snakePosY + colMutator;
        boolean foodHit = false;

        if (screen[nextRow][nextCol] == 'f') {
            foodCollected++;
            pythonLength++;
            foodHit = true;
        } else if (screen[nextRow][nextCol] == 'e') {
            foundEnemy = true;
            return;
        }

        if (foodHit) {
            screen[snakePosX][snakePosY] = '*';
            screen[nextRow][nextCol] = 's';
            foodWasHit = true;
        } else {
            if (foodWasHit) {
                screen[snakePosX][snakePosY] = 'f';
                screen[nextRow][nextCol] = 's';
                foodWasHit = false;
            } else {
                screen[snakePosX][snakePosY] = '*';
                screen[nextRow][nextCol] = 's';
            }
        }
        snakePosX = nextRow;
        snakePosY = nextCol;
    }
}
