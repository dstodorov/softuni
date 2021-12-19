package SoftUni.fundamentals.basicSyntax.moreExercises;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int letters = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < letters; i++) {
            int letter = Integer.parseInt(scanner.nextLine());
            int digit = letter % 10;
            if (digit == 0) {
                System.out.print(" ");
            } else {
                int number = letter;
                int length = 0;

                while (number > 0) {
                    number /= 10;
                    length++;
                }
                int offset = (digit - 2) * 3;
                if (digit == 8 || digit == 9) offset += 1;
                int letterIndex = offset + length - 1;
                System.out.print(Character.toChars(letterIndex + 97));
            }
        }
    }
}
