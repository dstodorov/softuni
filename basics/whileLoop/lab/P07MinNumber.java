package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;

        while (true) {
            String number = scanner.nextLine();

            if (number.equals("Stop")) {
                System.out.println(minNumber);
                break;
            } else {
                if (Integer.parseInt(number) < minNumber) {
                    minNumber = Integer.parseInt(number);
                }
            }
        }
    }
}
