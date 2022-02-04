package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int min = getMin(n1, n2, n3);

        System.out.println(min);
    }

    private static int getMin(int n1, int n2, int n3) {
        int min;

        if (n1 < n2 && n1 < n3) {
            min = n1;
        } else if (n2 < n1 && n2 < n3) {
            min = n2;
        }
        else if (n3 < n1 && n3 < n2) {
            min = n3;
        } else {
            min = n1;
        }

        return min;
    }
}
