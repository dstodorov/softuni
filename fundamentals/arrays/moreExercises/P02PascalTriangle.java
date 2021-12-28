package SoftUni.fundamentals.arrays.moreExercises;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] row = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == i || j == 0) {
                    row[i][j] = 1;
                } else {
                    row[i][j] = row[i - 1][j - 1] + row[i - 1][j];
                }
                System.out.print(row[i][j] + " ");
            }
            System.out.println();
        }
    }
}
