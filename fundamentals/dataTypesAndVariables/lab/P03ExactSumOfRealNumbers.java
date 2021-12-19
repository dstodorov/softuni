package SoftUni.fundamentals.dataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i < count; i++) {
            BigDecimal result = new BigDecimal(scanner.nextLine());
            sum = sum.add(result);
        }
        System.out.println(sum);
    }
}
