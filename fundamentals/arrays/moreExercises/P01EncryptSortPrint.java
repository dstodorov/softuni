package SoftUni.fundamentals.arrays.moreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String result = "";

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            int sum = 0;

            for (int c = 0; c < input.length(); c++) {
                boolean isVowel = checkIsVowel(input.charAt(c));

                if (isVowel) {
                    sum += (int) input.charAt(c) * input.length();
                } else {
                    sum += (int) input.charAt(c) / input.length();
                }
            }
            result += sum + " ";
        }

        int[] unsortedResult = Arrays.stream(result.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sortedResult = bubbleSort(unsortedResult);

        for (int number : sortedResult) {
            System.out.println(number);
        }
    }

    private static boolean checkIsVowel(char ch) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        boolean result = false;
        for (char vowel : vowels) {
            if (ch == vowel) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static int[] bubbleSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] > elements[j]) {
                    int temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
        return elements;
    }
}
