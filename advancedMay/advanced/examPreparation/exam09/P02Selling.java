package SoftUni.advancedMay.advanced.examPreparation.exam09;

import java.util.Scanner;

public class P02Selling {
    private static int playerPosX;
    private static int playerPosY;
    private static int targetXPos;
    private static int targetYPos;
    private static int pillarOnePosX = -1;
    private static int pillarOnePosY = -1;
    private static int pillarTwoPosX = -1;
    private static int pillarTwoPosY = -1;
    private static int collectedMoney = 0;
    private static boolean exitBakery = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] bakery = new char[size][size];

        for (int row = 0; row < bakery.length; row++) {
            String line = scanner.nextLine();
            bakery[row] = line.toCharArray();
            if (line.contains("O")) {
                if (pillarOnePosX != -1) {
                    pillarTwoPosX = row;
                    pillarTwoPosY = line.indexOf("O");
                } else {
                    pillarOnePosX = row;
                    pillarOnePosY = line.indexOf("O");
                }
            }
            if (line.contains("S")) {
                playerPosX = row;
                playerPosY = line.indexOf("S");
            }
        }
        while (collectedMoney != 50 && !exitBakery) {
            String command = scanner.nextLine();

            switch (command) {
                case "up":
                    move(bakery, -1, 0);
                    break;
                case "down":
                    move(bakery, 1, 0);
                    break;
                case "left":
                    move(bakery, 0, -1);
                    break;
                case "right":
                    move(bakery, 0, 1);
                    break;
            }
            if (collectedMoney >= 50) break;
            if (exitBakery) break;

        }
        if (collectedMoney >= 50) System.out.println("Good news! You succeeded in collecting enough money!");
        if (exitBakery) System.out.println("Bad news, you are out of the bakery.");
        System.out.println("Money: " + collectedMoney);
        print2DArray(bakery);
    }

    private static void move(char[][] bakery, int rowMutator, int colMutator) {
        int nextRow = playerPosX + rowMutator;
        int nextCol = playerPosY + colMutator;

        if (playerLeftPastry(bakery, nextRow, nextCol)) {
            exitBakery = true;
            bakery[playerPosX][playerPosY] = '-';
            return;
        }

        char nextValue = bakery[nextRow][nextCol];
        if (nextValue == 'O') {
            bakery[nextRow][nextCol] = '-';
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

        bakery[playerPosX][playerPosY] = '-';
        bakery[nextRow][nextCol] = 'S';
        playerPosX = nextRow;
        playerPosY = nextCol;
    }

    private static boolean playerLeftPastry(char[][] bakery, int row, int col) {
        return row < 0 || row >= bakery.length || col < 0 || col >= bakery[row].length;
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
