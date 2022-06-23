package SoftUni.advancedMay.examPreparation.exam07;

import java.util.Scanner;

public class P02CookingJourney {
    private static int playerPosX;
    private static int playerPosY;
    private static int collectedMoney = 0;
    private static boolean exitPastry = false;
    private static int pillarOnePosX = -1;
    private static int pillarOnePosY = -1;
    private static int pillarTwoPosX = -1;
    private static int pillarTwoPosY = -1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("S")) {
                playerPosX = row;
                playerPosY = line.indexOf("S");
            }
            if (line.contains("P")) {
                if (pillarOnePosX != -1) {
                    pillarTwoPosX = row;
                    pillarTwoPosY = line.indexOf("P");
                } else {
                    pillarOnePosX = row;
                    pillarOnePosY = line.indexOf("P");
                }
            }
        }


        while (collectedMoney != 50 && !exitPastry) {
            String command = scanner.nextLine();

            switch (command) {
                case "up":
                    move(matrix, -1, 0);
                    break;
                case "down":
                    move(matrix, 1, 0);
                    break;
                case "left":
                    move(matrix, 0, -1);
                    break;
                case "right":
                    move(matrix, 0, 1);
                    break;
            }
            if (collectedMoney >= 50) break;
            if (exitPastry) break;

        }

        if (collectedMoney >= 50) System.out.println("Good news! You succeeded in collecting enough money!");
        if (exitPastry) System.out.println("Bad news! You are out of the pastry shop.");
        System.out.println("Money: " + collectedMoney);
        print2DArray(matrix);
    }

    private static void move(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = playerPosX + rowMutator;
        int nextCol = playerPosY + colMutator;

        if (playerLeftPastry(matrix, nextRow, nextCol)) {
            exitPastry = true;
            matrix[playerPosX][playerPosY] = '-';
            return;
        }
        char nextValue = matrix[nextRow][nextCol];
        if (nextValue == 'P') {
            matrix[nextRow][nextCol] = '-';
            if (nextRow == pillarOnePosX && nextCol == pillarOnePosY) {
                nextRow = pillarTwoPosX;
                nextCol = pillarTwoPosY;
            } else {
                nextRow = pillarOnePosX;
                nextCol = pillarOnePosY;
            }
        } else if (nextValue != '-') {
            collectedMoney += Integer.parseInt(String.valueOf(nextValue));
        }

        matrix[playerPosX][playerPosY] = '-';
        matrix[nextRow][nextCol] = 'S';
        playerPosX = nextRow;
        playerPosY = nextCol;
    }

    private static boolean playerLeftPastry(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    private static void print2DArray(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
