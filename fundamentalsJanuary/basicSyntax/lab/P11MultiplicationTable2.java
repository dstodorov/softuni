package SoftUni.fundamentalsJanuary.basicSyntax.lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int from = Integer.parseInt(scanner.nextLine());
        if (from > 10) {
            System.out.printf("%d X %d = %d", number, from, number * from);
        } else {
            for (int i = from; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", number, i, number * i);
            }
        }
    }
}
