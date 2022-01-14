package SoftUni.fundamentalsJanuary.basicSyntax.exercises;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String correctPassword = "";
        int loginAttempts = 0;

        for (int i = username.length()-1; i >= 0; i--) {
            correctPassword += username.charAt(i);
        }

        while (!password.equals(correctPassword)) {
            System.out.println("Incorrect password. Try again.");
            loginAttempts++;
            if (loginAttempts >= 3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            password = scanner.nextLine();
        }
        if (loginAttempts < 3) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
