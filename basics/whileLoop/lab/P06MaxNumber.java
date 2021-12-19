package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;

        while (true) {
            String number = scanner.nextLine();

            if (number.equals("Stop")) {
                System.out.println(maxNumber);
                break;
            } else {
                if (Integer.parseInt(number) > maxNumber) {
                    maxNumber = Integer.parseInt(number);
                }
            }
        }
    }
}
