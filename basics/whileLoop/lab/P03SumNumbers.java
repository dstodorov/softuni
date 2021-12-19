package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true) {
            sum += Integer.parseInt(scanner.nextLine());
            if (sum >= number) {
                System.out.println(sum);
                break;
            }
        }
    }
}
