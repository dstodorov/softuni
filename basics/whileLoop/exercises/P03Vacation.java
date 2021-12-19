package SoftUni.basics.whileLoop.exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int daysPassed = 0;
        int spendDays = 0;

        while (true) {
            String operation = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            daysPassed++;
            if (operation.equals("spend")) {
                savedMoney -= amount;
                if (savedMoney < 0) savedMoney = 0;
                spendDays++;
            } else if (operation.equals("save")){
                savedMoney += amount;
                spendDays = 0;
            }

            if (spendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysPassed);
                break;
            }

            if (savedMoney >= moneyNeeded) {
                System.out.printf("You saved the money for %d days.", daysPassed);
                break;
            }

        }
    }
}
