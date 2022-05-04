package SoftUni.advancedMay.multidimensionalArrays.exercises;

import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String[][] matrix = getMatrix(scanner, rows, cols);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] commandParameters = input.split(" ");
            boolean validCommand = commandParameters[0].equals("swap") && commandParameters.length == 5;
            boolean validParameters = false;
            int[] validatedParameters = new int[4];
            if (validCommand) {
                int[] params = new int[4];
                params[0] = Integer.parseInt(commandParameters[1]);
                params[1] = Integer.parseInt(commandParameters[2]);
                params[2] = Integer.parseInt(commandParameters[3]);
                params[3] = Integer.parseInt(commandParameters[4]);
                validParameters = validateCoordinates(rows, cols, params);
                if (validParameters) {
                    validatedParameters = params;
                }
            }

            if (validParameters) {
                matrix = swapCells(matrix, validatedParameters);
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] swapCells(String[][] matrix, int[] params) {
        String temp = matrix[params[0]][params[1]];
        matrix[params[0]][params[1]] = matrix[params[2]][params[3]];
        matrix[params[2]][params[3]] = temp;
        return matrix;
    }

    private static boolean validateCoordinates(int numberOfRows, int numberOfCols, int[] coordinates) {
        return coordinates[0] >= 0 && coordinates[0] <= numberOfRows - 1
                && coordinates[1] >= 0 && coordinates[1] <= numberOfCols - 1
                && coordinates[2] >= 0 && coordinates[2] <= numberOfRows - 1
                && coordinates[3] >= 0 && coordinates[3] <= numberOfCols - 1;
    }

    private static String[][] getMatrix(Scanner scanner, int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.next();
            }
        }

        String buffer = scanner.nextLine();

        return matrix;
    }
}
