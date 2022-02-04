package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P10PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(checkIsPalindrome(number));
            input = scanner.nextLine();
        }
    }

    private static boolean checkIsPalindrome(int number) {
        boolean isPalindrome = true;

        String numberToText = String.valueOf(number);

        for (int i = 0; i < numberToText.length(); i++) {
            if (numberToText.charAt(i) != numberToText.charAt(numberToText.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
