package SoftUni.fundamentalsJanuary.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String message = "";
        for (int i = 0; i < lines; i++) {
            char character = scanner.nextLine().charAt(0);
            message += Character.toString(character + key);
        }
        System.out.print(message);
    }
}
