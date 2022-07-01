package SoftUni.advancedMay.advanced.multidimensionalArrays.exercises;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        String[][] matrix = getMatrixOfPalindromes(rows, columns);

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] getMatrixOfPalindromes(int rows, int columns) {
        String[][] matrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char firstChar = getCharacter(row);
                char secondChar = getCharacter(row, col);
                char thirdChar = getCharacter(row);
                matrix[row][col] = String.valueOf(firstChar) + secondChar + thirdChar;
            }
        }
        return matrix;
    }

    private static char getCharacter(int row, int col) {
        return (char) (97 + (row + col));
    }

    private static char getCharacter(int row) {
        return (char) (97 + row);
    }
}
