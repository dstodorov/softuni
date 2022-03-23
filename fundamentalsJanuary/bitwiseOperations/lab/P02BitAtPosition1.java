package SoftUni.fundamentalsJanuary.bitwiseOperations.lab;

import java.util.Scanner;

public class P02BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int bitAtPosition1 = getBitAtPosition1(n);
        System.out.println(bitAtPosition1);
    }

    public static int getBitAtPosition1(int number) {
        int position = 0;
        int bit = 0;
        while (number > 0) {
            if (position == 1) bit = number % 2;
            number /= 2;
            position++;
        }
        return bit;
    }
}
