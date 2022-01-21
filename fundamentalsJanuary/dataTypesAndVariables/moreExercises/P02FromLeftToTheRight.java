package SoftUni.fundamentalsJanuary.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {
            long left = Long.parseLong(scanner.next());
            long right = Long.parseLong(scanner.next());
            if (left > right) {
                System.out.println(sumDigits(left));
            } else {
                System.out.println(sumDigits(right));
            }
        }
    }

    private static long sumDigits(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return Math.abs(sum);
    }


}
