package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder uniques = new StringBuilder("0 ");

        for (int number : numbers) {
            for (int j = 1; j < numbers.length; j++) {
                if (isUnique(uniques.toString(), number) && isUnique(uniques.toString(), numbers[j])) {
                    if (number != numbers[j] && number + numbers[j] == givenNumber) {
                        //System.out.println(number + " " + numbers[j]);
                        System.out.printf("%d %d%n", number, numbers[j]);
                        uniques.append(number).append(" ");
                        uniques.append(numbers[j]).append(" ");
                    }
                }
            }
        }
    }

    private static boolean isUnique(String input, int numberToCheck) {
        boolean result = true;
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer:: parseInt).toArray();
        for (int number : numbers) {
            if (numberToCheck == number){
                result = false;
                break;
            }
        }
        return result;
    }
}
