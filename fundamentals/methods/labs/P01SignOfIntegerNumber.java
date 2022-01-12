package SoftUni.fundamentals.methods.labs;

import java.util.Scanner;

public class P01SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getSignOfInteger(number));
    }

    private static String getSignOfInteger(int number) {
        if (number > 0) {
            return "The number " + number + " is positive.";
        } else if (number == 0) {
            return "The number " + number + " is zero.";
        } else {
            return "The number " + number + " is negative.";
        }
    }
}
