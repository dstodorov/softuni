package SoftUni.fundamentals.arrays.exercises;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int[] train = new int[numbers];
        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }

        for(int number : train) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
