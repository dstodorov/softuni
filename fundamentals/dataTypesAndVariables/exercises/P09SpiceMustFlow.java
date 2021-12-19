package SoftUni.fundamentals.dataTypesAndVariables.exercises;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int mineWorkingDays = 0;

        for (int i = startingYield; i >= 100; i -= 10) {
            totalSpices += i;
            totalSpices -= 26;
            mineWorkingDays++;
        }
        if (totalSpices >= 26) totalSpices -= 26;
        System.out.println(mineWorkingDays);
        System.out.println(totalSpices);
    }
}
