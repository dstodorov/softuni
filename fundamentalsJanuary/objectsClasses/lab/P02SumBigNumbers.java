package SoftUni.fundamentalsJanuary.objectsClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger numOne = new BigInteger(scanner.nextLine());
        BigInteger numTwo = new BigInteger(scanner.nextLine());

        BigInteger result = numOne.add(numTwo);

        System.out.println(result);
    }
}
