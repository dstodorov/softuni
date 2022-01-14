package SoftUni.fundamentalsJanuary.basicSyntax.moreExercises;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int characters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= characters; i++) {
            int letter = Integer.parseInt(scanner.nextLine());
            int tempNumber = letter;
            int digits = 0;
            int mainDigit = letter % 10;
            if (mainDigit == 0) {
                System.out.print(" ");
            } else {
                int offset = (mainDigit - 2) * 3;
                int letterIndex = 0;
                while (tempNumber != 0) {
                    tempNumber /= 10;
                    digits++;
                }
                if (mainDigit == 8 || mainDigit == 9) offset++;
                letterIndex = offset + digits - 1;
                System.out.print(Character.toChars(letterIndex + 97));
            }

        }
    }
}
