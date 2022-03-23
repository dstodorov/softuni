package SoftUni.fundamentalsJanuary.textProcessing.moreExercises;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String chars = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < chars.length(); i++) {
            int current = chars.charAt(i);
            if (current > first && current < second) sum += current;
        }
        System.out.println(sum);
    }
}
