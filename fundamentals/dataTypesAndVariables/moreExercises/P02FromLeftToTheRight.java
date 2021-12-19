package SoftUni.fundamentals.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long left = Long.parseLong(numbers[0]);
            long right = Long.parseLong(numbers[1]);
            int sum = 0;

            if (left > right) {
                while (left != 0) {
                    sum += left % 10;
                    left /= 10;
                }
            } else {
                while (right != 0) {
                    sum += (int)(right % 10);
                    right /= 10;
                }
            }
            System.out.printf("%d%n",sum);
        }
    }
}