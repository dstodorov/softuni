package SoftUni.advancedMay.multidimensionalArrays.exercises;

import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int sumPrimaryDiagonal = getPrimaryDiagonalSum(matrix);
        int sumSecondaryDiagonal = getSecondaryDiagonalSum(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }


    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        int col = matrix.length - 1;
        for (int[] ints : matrix) {
            sum += ints[col];
            col--;
        }
        return sum;
    }
}
