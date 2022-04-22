package SoftUni.advancedMay.stacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinaryConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());
        if (decimalNumber == 0) {
            System.out.println(0);
        } else {
            ArrayDeque<Integer> binaryNumberStack = new ArrayDeque<>();

            while (decimalNumber > 0) {
                binaryNumberStack.push(decimalNumber % 2);
                decimalNumber /= 2;
            }

            while (binaryNumberStack.size() > 0) {
                System.out.print(binaryNumberStack.pop());
            }
        }

    }
}
