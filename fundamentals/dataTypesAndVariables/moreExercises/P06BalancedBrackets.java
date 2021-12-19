package SoftUni.fundamentals.dataTypesAndVariables.moreExercises;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int openCounter = 0;
        int closeCounter = 0;
        boolean open = false;
        boolean close = false;


        for (int i = 1; i <= lines; i++) {
            String line = scanner.nextLine().trim();

            if (line.equals("(")) {
                if (open && openCounter != closeCounter) {
                    open = false;
                } else {
                    open = true;
                    openCounter++;
                }
            }
            if (line.equals(")")) {
                if (close && openCounter == closeCounter) {
                    close = false;
                } else {
                    close = true;
                    closeCounter++;
                }
            }
        }
        if (open && close && openCounter == closeCounter) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
