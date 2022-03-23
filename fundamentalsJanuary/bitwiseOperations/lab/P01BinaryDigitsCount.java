package SoftUni.fundamentalsJanuary.bitwiseOperations.lab;

import java.util.Scanner;

public class P01BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int count = convertAndCountDecToBit(n, b);
        System.out.println(count);
    }

    public static int convertAndCountDecToBit(int number, int b) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == b) count++;
            number /= 2;
        }
        return count;
    }
}
