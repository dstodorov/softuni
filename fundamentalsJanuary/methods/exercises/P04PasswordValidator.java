package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if(isPasswordValid(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isPasswordValid(String password) {
        boolean validNumberOfCharacters = validateNumberOfCharacters(password);
        boolean validCharacters = checkIsOnlyLettersAndDigits(password);
        boolean validateDigits = checkIsHasAtLeastTwoDigits(password);

        return validNumberOfCharacters && validCharacters && validateDigits;

    }

    private static boolean checkIsHasAtLeastTwoDigits(String password) {
        int numberOfDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
        }

        if (numberOfDigits < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }

        return true;
    }

    private static boolean checkIsOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            boolean check = Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i));
            if (!check) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    private static boolean validateNumberOfCharacters(String password) {
        boolean check = password.length() >= 6 && password.length() <= 10;
        if (!check) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}
