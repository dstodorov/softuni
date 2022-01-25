package SoftUni.fundamentalsJanuary.Arrays.lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.printf("%s ", strings[i]);
        }
    }
}
