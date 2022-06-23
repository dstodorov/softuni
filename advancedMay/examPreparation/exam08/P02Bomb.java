package SoftUni.advancedMay.examPreparation.exam08;

import java.util.Scanner;

public class P02Bomb {
    private static int sapperPosX;
    private static int sapperPosY;
    private static int finishPosX;
    private static int finishPosY;
    private static int bombsFound = 0;
    private static int bombsToCollect = 0;
    private static boolean endOfRoad = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];
        String[] commands = scanner.nextLine().split(",");
        for (int row = 0; row < field.length; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < line.length; col++) {
                field[row][col] = line[col].charAt(0);
                if (line[col].charAt(0) == 's') {
                    sapperPosX = row;
                    sapperPosY = col;
                }
                if (line[col].charAt(0) == 'e') {
                    finishPosX = row;
                    finishPosY = col;
                }
                if (line[col].charAt(0) == 'B') bombsToCollect++;
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
            if (endOfRoad) break;
            //print2DArray(field);
        }

        if (bombsFound == bombsToCollect) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (endOfRoad) {
            System.out.printf("END! %d bombs left on the field%n", (bombsToCollect - bombsFound));
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)%n", (bombsToCollect - bombsFound), sapperPosX, sapperPosY);
        }

    }

    private static void move(char[][] field, int rowMutator, int colMutator) {
        int nextRow = rowMutator + sapperPosX;
        int nextCol = colMutator + sapperPosY;

        if (!isSapperOnField(field, nextRow, nextCol)) {
            return;
        }
        char spotValue = field[nextRow][nextCol];
        if (spotValue == 'B') {
            bombsFound++;
            System.out.println("You found a bomb!");
        } else if (spotValue == 'e') {
            endOfRoad = true;
            return;
        }

        field[sapperPosX][sapperPosY] = '+';
        field[nextRow][nextCol] = 's';
        sapperPosX = nextRow;
        sapperPosY = nextCol;
    }

    private static boolean isSapperOnField(char[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }
}