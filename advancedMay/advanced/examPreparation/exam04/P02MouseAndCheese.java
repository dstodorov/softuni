package SoftUni.advancedMay.advanced.examPreparation.exam04;

import java.util.Scanner;

public class P02MouseAndCheese {
    private static int mousePosX;
    private static int mousePosY;
    private static int cheeseCount = 0;
    private static boolean mouseInField = true;
    private static boolean bonusReceived = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int row = 0; row < field.length; row++) {
            String line = scanner.nextLine();
            field[row] = line.toCharArray();
            if (line.contains("M")) {
                mousePosX = row;
                mousePosY = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end") && mouseInField) {

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

            if (!mouseInField) break;

            command = scanner.nextLine();
        }

        if (!mouseInField) {
            System.out.println("Where is the mouse?");
        }
        if (cheeseCount < 5) {
            System.out.println("The mouse couldn't eat the cheeses, she needed " + (5 - cheeseCount) + " cheeses more.");
        } else {
            System.out.println("Great job, the mouse is fed " + cheeseCount + " cheeses!");
        }

        printMatrix(field);
    }

    private static void printMatrix(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    private static void move(char[][] field, int rowMutator, int colMutator) {
        int nextRow = mousePosX + rowMutator;
        int nextCol = mousePosY + colMutator;

        bonusReceived = false;

        if (!isMouseInField(field, nextRow, nextCol)) {
            mouseInField = false;
            field[mousePosX][mousePosY] = '-';
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            cheeseCount++;
        } else if (field[nextRow][nextCol] == 'B') {
            bonusReceived = true;
        }

        field[mousePosX][mousePosY] = '-';
        field[nextRow][nextCol] = 'M';
        mousePosX = nextRow;
        mousePosY = nextCol;

        if (bonusReceived) {
            move(field, rowMutator, colMutator);
        }
    }

    private static boolean isMouseInField(char[][] field, int nextRow, int nextCol) {
        return nextRow >= 0 && nextRow < field.length && nextCol >= 0 && nextCol < field[nextRow].length;
    }
}
