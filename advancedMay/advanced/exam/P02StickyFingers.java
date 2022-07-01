package SoftUni.advancedMay.advanced.exam;

import java.util.Scanner;

public class P02StickyFingers {
    private static int playerPosX;
    private static int playerPosY;
    private static int targetXPos;
    private static int targetYPos;
    private static boolean policeFound = false;
    private static int moneyStolen = 0;
    private static int moves = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        String[] commands = scanner.nextLine().split(",");
        for (int row = 0; row < field.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < line.length; col++) {
                field[row][col] = line[col].charAt(0);
                if (line[col].charAt(0) == 'D') {
                    playerPosX = row;
                    playerPosY = col;
                }
            }
        }

        for (String command : commands) {
            switch (command) {
                case "up":
                    move(field, -1, 0);
                    break;
                case "down":
                    move(field, 1, 0);
                    break;
                case "left":
                    move(field, 0, -1);
                    break;
                case "right":
                    move(field, 0, 1);
                    break;
            }
            if (policeFound) {
                break;
            }
        }

        if (!policeFound) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", moneyStolen);
        } else {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", moneyStolen);
        }
        print2DArray(field);
    }

    private static void move(char[][] field, int rowMutator, int colMutator) {
        int nextRow = rowMutator + playerPosX;
        int nextCol = colMutator + playerPosY;

        if (!isPlayerInTown(field, nextRow, nextCol)) {
            System.out.println("You cannot leave the town, there is police outside!");
            return;
        }
        char spotValue = field[nextRow][nextCol];
        if (spotValue == '$') {
            moneyStolen += nextRow * nextCol;
            System.out.printf("You successfully stole %d$.%n", (nextRow * nextCol));
        } else if (spotValue == 'P') {
            field[nextRow][nextCol] = '#';
            field[playerPosX][playerPosY] = '+';
            policeFound = true;
        }

        moves++;
        field[playerPosX][playerPosY] = '+';
        if (policeFound) field[nextRow][nextCol] = '#';
        else field[nextRow][nextCol] = 'D';
        playerPosX = nextRow;
        playerPosY = nextCol;
    }

    private static boolean isPlayerInTown(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }

    private static void print2DArray(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
