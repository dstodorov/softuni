package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.next();
        String s2 = scanner.next();

        int totalSumOfChars = sumCharacterCodes(s1, s2);
        System.out.println(totalSumOfChars);


    }

    static int sumCharacterCodes(String s1, String s2) {

        String bigger = "";
        String smaller = "";
        if (s1.length() > s2.length()) {
            bigger = s1;
            smaller = s2;
        } else {
            bigger = s2;
            smaller = s1;
        }

        int totalSum = 0;
        for (int i = 0; i < bigger.length(); i++) {
            if (i <= smaller.length() - 1) {
                //sum both chars
                totalSum += (int) bigger.charAt(i) * (int) smaller.charAt(i);
            } else {
                //sum only bigger chars
                totalSum += bigger.charAt(i);
            }
        }
        return totalSum;
    }
}
