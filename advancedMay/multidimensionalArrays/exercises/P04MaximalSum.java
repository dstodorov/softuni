package SoftUni.advancedMay.multidimensionalArrays.exercises;

import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = scanner.nextInt();
        int numberOfCols = scanner.nextInt();

        int[][] matrix = readMatrix(scanner, numberOfRows, numberOfCols);

        printMaxSum(matrix);
    }

    private static void printMaxSum(int[][] matrix) {
        int maxSum = 0;
        int[][] bestMatrix = new int[3][3];
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[][] innerMatrix = new int[3][3];
                innerMatrix[0][0] = matrix[row][col];
                innerMatrix[0][1] = matrix[row][col + 1];
                innerMatrix[0][2] = matrix[row][col + 2];
                innerMatrix[1][0] = matrix[row + 1][col];
                innerMatrix[1][1] = matrix[row + 1][col + 1];
                innerMatrix[1][2] = matrix[row + 1][col + 2];
                innerMatrix[2][0] = matrix[row + 2][col];
                innerMatrix[2][1] = matrix[row + 2][col + 1];
                innerMatrix[2][2] = matrix[row + 2][col + 2];

                int sum = getSum(innerMatrix);
                if (sum > maxSum) {
                    maxSum = sum;
                    bestMatrix = innerMatrix;
                }


            }
        }

        System.out.println("Sum = " + maxSum);
        printMatrix(bestMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int numberOfRows, int numberOfCols) {
        int[][] matrix = new int[numberOfRows][numberOfCols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
