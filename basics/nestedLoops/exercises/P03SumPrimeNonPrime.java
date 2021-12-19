package SoftUni.basics.nestedLoops.exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "";

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (true) {
            number = scanner.nextLine();
            if (!number.equals("stop")) {
                int n = Integer.parseInt(number);
                if (n < 0) {
                    System.out.println("Number is negative.");
                } else {
                    int counter = 0;

                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            counter++;
                        }
                    }
                    if (counter > 2) {
                        sumNonPrimeNumbers += n;
                    } else {
                        sumPrimeNumbers += n;
                    }
                }
            } else {
                break;
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrimeNumbers);
    }
}
