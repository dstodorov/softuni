package SoftUni.basics.firstSteps.exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        float rate = Float.parseFloat(scanner.nextLine());

        double sum = amount + (period * (amount * (rate/100))/12);
        System.out.printf("%.2f", sum);
    }
}
