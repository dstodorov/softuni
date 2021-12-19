package SoftUni.basics.conditionalStatements.lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretPassword = "s3cr3t!P@ssw0rd";
        String guess = scanner.nextLine();

        if (guess.equals(secretPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
