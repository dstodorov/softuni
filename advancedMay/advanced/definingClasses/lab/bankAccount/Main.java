package SoftUni.advancedMay.advanced.definingClasses.lab.bankAccount;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] inputCommand = input.split("\\s+");
            if (inputCommand[0].equals("Create")) {
                bankAccounts.put(BankAccount.getNextId(), new BankAccount());
            } else if (inputCommand[0].equals("Deposit")) {
                if (bankAccounts.containsKey(Integer.parseInt(inputCommand[1]))) {
                    bankAccounts.get(Integer.parseInt(inputCommand[1])).deposit(Double.parseDouble(inputCommand[2]));
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.printf("Deposited %s to %s%n", df.format(Double.parseDouble(inputCommand[2])), bankAccounts.get(Integer.parseInt(inputCommand[1])).getAccountId());
                } else {
                    System.out.println("Account does not exist");
                }
            } else if (inputCommand[0].equals("SetInterest")) {
                BankAccount.setInterestRate(Double.parseDouble(inputCommand[1]));
            } else if (inputCommand[0].equals("GetInterest")) {
                if (bankAccounts.containsKey(Integer.parseInt(inputCommand[1]))) {
                    System.out.printf("%.2f%n", bankAccounts.get(Integer.parseInt(inputCommand[1])).getInterest(Integer.parseInt(inputCommand[2])));
                } else {
                    System.out.println("Account does not exist");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println();
    }
}
