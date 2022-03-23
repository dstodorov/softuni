package SoftUni.fundamentalsJanuary.textProcessing.lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String word = input;
            String reversedWord = reverseString(word);

            System.out.println(word + " = " + reversedWord);
            input = scanner.nextLine();
        }


    }

    static String reverseString(String str) {
        StringBuilder output = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
