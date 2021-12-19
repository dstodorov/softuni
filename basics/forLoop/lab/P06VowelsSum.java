package SoftUni.basics.forLoop.lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') sum += 1;
            if (text.charAt(i) == 'e') sum += 2;
            if (text.charAt(i) == 'i') sum += 3;
            if (text.charAt(i) == 'o') sum += 4;
            if (text.charAt(i) == 'u') sum += 5;
        }
        System.out.println(sum);
    }
}
