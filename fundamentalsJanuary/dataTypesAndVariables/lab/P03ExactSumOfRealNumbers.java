package SoftUni.fundamentalsJanuary.dataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        BigDecimal exactSum = new BigDecimal(0);
        for (int i = 0; i < numbers; i++) {
            BigDecimal bigNumber = new BigDecimal(scanner.nextLine());
            exactSum = exactSum.add(bigNumber);
        }
        System.out.println(exactSum);
    }
}
