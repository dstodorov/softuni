package SoftUni.fundamentals.arrays.exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str1 = scanner.nextLine().split(" ");
        String[] str2 = scanner.nextLine().split(" ");

        StringBuilder finalStr = new StringBuilder();

        for (String elementStr2 : str2) {
            for (String elementStr1 : str1) {
                if (elementStr1.equals(elementStr2)) {
                    finalStr.append(elementStr1);
                    finalStr.append(" ");
                }
            }
        }
        System.out.println(finalStr);
    }
}
