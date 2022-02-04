package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P06AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int sumResult = sum(n1, n2);
        int subtractResult = subtract(sumResult, n3);

        System.out.println(subtractResult);
    }

    private static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    private static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
