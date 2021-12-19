package SoftUni.basics.conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        switch (town) {
            case "Sofia": {
                if (sells >= 0 && sells <= 500) {
                    System.out.printf("%.2f", sells * 0.05);
                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.07);
                } else if (sells > 1000 && sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.08);
                } else if (sells > 1000) {
                    System.out.printf("%.2f", sells * 0.12);
                } else {
                    System.out.println("error");
                }
                break;
            }
            case "Varna": {
                if (sells >= 0 && sells <= 500) {
                    System.out.printf("%.2f", sells * 0.045);
                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.075);
                } else if (sells > 1000 && sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.1);
                } else if (sells > 1000) {
                    System.out.printf("%.2f", sells * 0.13);
                } else {
                    System.out.println("error");
                }
                break;
            }
            case "Plovdiv": {
                if (sells >= 0 && sells <= 500) {
                    System.out.printf("%.2f", sells * 0.055);
                } else if (sells > 500 && sells <= 1000) {
                    System.out.printf("%.2f", sells * 0.08);
                } else if (sells > 1000 && sells <= 10000) {
                    System.out.printf("%.2f", sells * 0.12);
                } else if (sells > 1000) {
                    System.out.printf("%.2f", sells * 0.145);
                } else {
                    System.out.println("error");
                }
                break;
            }
            default: {
                System.out.println("error");
                break;
            }
        }
    }
}
