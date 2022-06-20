package SoftUni.advancedMay.examPreparation.exam03;

import java.util.Scanner;

public class P02ThroneConquering {
    private static int playerRowPos;
    private static int playerColPos;
    private static int targetXPos;
    private static int targetYPos;
    private static boolean playerFoundTarget = false;
    private static boolean playerDied = false;
    private static int energy;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        energy = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int row = 0; row < field.length; row++) {
            String line = scanner.nextLine();
            field[row] = line.toCharArray();
            if (line.contains("H")) {
                targetXPos = row;
                targetYPos = line.indexOf("H");
            }
            if (line.contains("P")) {
                playerRowPos = row;
                playerColPos = line.indexOf("P");
            }
        }


        while (!playerFoundTarget && !playerDied) {
            String[] commandParams = scanner.nextLine().split("\\s+");
            String command = commandParams[0];
            int enemyXPos = Integer.parseInt(commandParams[1]);
            int enemyYPos = Integer.parseInt(commandParams[2]);

            field[enemyXPos][enemyYPos] = 'S';

            switch (command) {
                case "up":
                    move(field, playerRowPos - 1, playerColPos);
                    break;
                case "down":
                    move(field, playerRowPos + 1, playerColPos);
                    break;
                case "left":
                    move(field, playerRowPos, playerColPos - 1);
                    break;
                case "right":
                    move(field, playerRowPos, playerColPos + 1);
                    break;
            }
        }
        if (playerFoundTarget) {
            System.out.println("Paris has successfully abducted Helen! Energy left: " + energy);
        }
        if (!playerFoundTarget && playerDied) {
            System.out.println("Paris died at " + playerRowPos + ";" + playerColPos + ".");
        }
        print2DArray(field);
    }

    private static void move(char[][] field, int nextRow, int nextCol) {
        energy--;

        if (!isInBounds(field, nextRow, nextCol)) return;

        if (field[nextRow][nextCol] == 'H') {
            playerFoundTarget = true;
        } else if (field[nextRow][nextCol] == 'S') {
            energy -= 2;
        }
        if (energy <= 0) {
            playerDied = true;
        }

        field[playerRowPos][playerColPos] = '-';

        if (playerFoundTarget) field[nextRow][nextCol] = '-';
        else if (playerDied) field[nextRow][nextCol] = 'X';
        else field[nextRow][nextCol] = 'P';

        playerRowPos = nextRow;
        playerColPos = nextCol;
    }

    private static boolean isInBounds(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }

    private static void print2DArray(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
