package SoftUni.fundamentalsJanuary.arrays.exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstString = scanner.nextLine().split(" ");
        String[] secondString = scanner.nextLine().split(" ");

        for (String second : secondString) {
            for (String first : firstString) {
                if (second.equals(first)) System.out.print(first + " ");
            }
        }
    }
}
