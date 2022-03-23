package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (username.matches("[a-zA-Z1-9-_]+") && username.length() >= 3 && username.length() <= 16) {
                System.out.println(username);
            }
        }
    }
}
