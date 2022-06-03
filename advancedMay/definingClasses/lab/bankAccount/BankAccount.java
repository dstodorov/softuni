package SoftUni.advancedMay.definingClasses.lab.bankAccount;

public class BankAccount {


    private double balance = 0;
    private static int id = 1;
    private static double interestRate = 0.02;
    private final int currentAccountId;

    public static int getNextId() {
        return id;
    }

    public BankAccount() {
        this.currentAccountId = BankAccount.id;
        BankAccount.id = id + 1;
        this.balance = 0.0;
        System.out.printf("Account %s created%n", getAccountId());
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * this.balance * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getAccountId() {
        return String.format("ID%d", this.currentAccountId);
    }
}
