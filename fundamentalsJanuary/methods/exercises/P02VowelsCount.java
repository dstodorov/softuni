package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int numberOfVowels = countVowels(text);
        System.out.println(numberOfVowels);


    }

    private static int countVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) == 'a'
                    || Character.toLowerCase(text.charAt(i)) == 'e'
                    || Character.toLowerCase(text.charAt(i)) == 'i'
                    || Character.toLowerCase(text.charAt(i)) == 'o'
                    || Character.toLowerCase(text.charAt(i)) == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
