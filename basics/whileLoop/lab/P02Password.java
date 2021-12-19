package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            String loginPassword = scanner.nextLine();
            if(loginPassword.equals(password)) {
                System.out.printf("Welcome %s!", username);
                break;
            }
        }
    }
}
