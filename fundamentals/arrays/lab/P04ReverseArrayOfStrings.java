package SoftUni.fundamentals.arrays.lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] textToArray = text.split(" ");
        for(int i = textToArray.length - 1; i >= 0; i--) {
            System.out.print(textToArray[i] + " ");
        }
    }
}
