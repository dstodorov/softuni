package SoftUni.fundamentals.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int characters = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < characters; i++) {
            char symbol = scanner.nextLine().charAt(0);
            message.append(Character.toChars(symbol+key));
        }
        System.out.println(message);
    }
}
