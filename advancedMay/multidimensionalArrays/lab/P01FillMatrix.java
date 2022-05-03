package SoftUni.advancedMay.multidimensionalArrays.lab;

import java.util.Scanner;

public class P01FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parameters = scanner.nextLine().split(", ");
        int size = Integer.parseInt(parameters[0]);
        char type = parameters[1].charAt(0);
        int[][] matrix;
        if (type == 'A') {
            matrix = getMatrixOfTypeA(size);
            printMatrix(matrix);
        } else if (type == 'B') {
            matrix = getMatrixOfTypeB(size);
            printMatrix(matrix);
        }


    }

    private static void printMatrix(int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[col][row] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrixOfTypeA(int size) {
        int columnNumber = 1;
        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col++) {
            int rowNumber = columnNumber + size;
            matrix[col][0] = columnNumber;
            for (int row = 1; row < size; row++) {
                matrix[col][row] = rowNumber;
                rowNumber += size;
            }
            columnNumber++;
        }
        return matrix;
    }


    private static int[][] getMatrixOfTypeB(int size) {
        int[][] matrix = new int[size][size];
        for (int col = 0; col < size; col++) {
            int multiplier = 2;
            for (int row = 0; row < size; row++) {
                if (col == 0) {
                    if (row == 0) matrix[col][row] = 1;
                    else {
                        if (row % 2 == 0) {
                            matrix[col][row] = matrix[col][row - 1] + 1;
                        } else {
                            matrix[col][row] = multiplier * size;
                            multiplier += 2;
                        }
                    }
                } else {
                    if (row % 2 == 0) {
                        matrix[col][row] = matrix[col - 1][row] + 1;
                    } else {
                        matrix[col][row] = matrix[col - 1][row] - 1;
                    }
                }

            }
        }
        return matrix;
    }
}
