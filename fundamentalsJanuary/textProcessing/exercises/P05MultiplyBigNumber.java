package SoftUni.fundamentalsJanuary.textProcessing.exercises;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier == 0 || (bigNumber.length() == 1 && Integer.parseInt(bigNumber) == 0)) System.out.println(0);
        else {
            String result = multiply(bigNumber, multiplier);
            System.out.println(result);
        }

    }

    private static String multiply(String bigNumber, int multiplier) {
        StringBuilder result = new StringBuilder();
        bigNumber = bigNumber.replaceAll("^0+(?!$)", "");
        int divider = 0;
        int multipliedResult = 0;
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            multipliedResult = Character.getNumericValue(bigNumber.charAt(i)) * multiplier + divider;
            divider = multipliedResult / 10;
            int reminder = (multipliedResult % 10);
            result.insert(0, reminder);
        }
        if (divider > 0) result.insert(0, divider);

        return result.toString();
    }
}
