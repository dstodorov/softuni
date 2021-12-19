package SoftUni.basics.nestedLoops.lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = "";
        double moneyNeeded = 0;
        double savedMoney = 0;
        while (true) {
            destination = scanner.nextLine();
            if (!destination.equals("End")){
                moneyNeeded = Double.parseDouble(scanner.nextLine());
                while (savedMoney < moneyNeeded) {
                    savedMoney += Double.parseDouble(scanner.nextLine());
                }
                savedMoney = 0;
                System.out.printf("Going to %s!%n", destination);
            } else {
                break;
            }
        }
    }
}
