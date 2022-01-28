package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P10GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")) {
            int numberOne = Integer.parseInt(scanner.nextLine());
            int numberTwo = Integer.parseInt(scanner.nextLine());
            int max = getMax(numberOne, numberTwo);
            System.out.println(max);
        } else if (type.equals("string")) {
            String textOne = scanner.nextLine();
            String textTwo = scanner.nextLine();
            String max = getMax(textOne, textTwo);
            System.out.println(max);
        } else if (type.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            char max = getMax(a, b);
            System.out.println(max);
        }
    }

    private static int getMax(int n1, int n2) {
        return Math.max(n1, n2);
    }

    private static String getMax(String txtOne, String txtTwo) {
        return txtOne.compareTo(txtTwo) > 0 ? txtOne : txtTwo;
    }

    private static char getMax(char s1, char s2) {
        return s1 > s2 ? s1 : s2;
    }
}
