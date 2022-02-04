package SoftUni.fundamentalsJanuary.methods.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P12ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");

            if (input[0].equals("exchange")) {
                int index = Integer.parseInt(input[1]);
                if (index >= 0 && index <= numbers.length - 1) {
                    numbers = exchangeArrayAtIndex(numbers, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (input[0].equals("max")) {
                String evenOrOdd = input[1];
                printMaxElementIndex(numbers, evenOrOdd);
            } else if (input[0].equals("min")) {
                String evenOrOdd = input[1];
                printMinElementIndex(numbers, evenOrOdd);
            } else if (input[0].equals("first")) {
                String type = input[2];
                int counter = Integer.parseInt(input[1]);
                if (counter > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    printFirstNNumbers(numbers, type, counter);
                }
            } else if (input[0].equals("last")) {
                String type = input[2];
                int counter = Integer.parseInt(input[1]);
                if (counter > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    printLastNNumbers(numbers, type, counter);
                }

            }

            command = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.printf("%d", numbers[i]);
            } else {
                System.out.printf("%d, ", numbers[i]);
            }
        }
        System.out.print("]");
    }

    private static void printFirstNNumbers(int[] numbers, String type, int counter) {
        if (type.equals("even")) {
            int[] evenNumbers = getEvenNumbers(numbers);
            if (evenNumbers.length > counter) {
                printFirstEvenNumbers(evenNumbers, counter);
            } else {
                printFirstEvenNumbers(evenNumbers);
            }
        } else if (type.equals("odd")) {
            int[] oddNumbers = getOddNumbers(numbers);
            if (oddNumbers.length > counter) {
                printFirstOddNumbers(oddNumbers, counter);
            } else {
                printFirstOddNumbers(oddNumbers);
            }
        }
    }

    private static void printFirstOddNumbers(int[] oddNumbers) {
        printFirstOddNumbers(oddNumbers, oddNumbers.length);
    }

    private static void printFirstOddNumbers(int[] oddNumbers, int counter) {
        int endPosition = oddNumbers.length;
        if (counter <= oddNumbers.length) {
            endPosition = counter;
        }
        System.out.print("[");
        for (int i = 0; i < endPosition; i++) {
            if (i != endPosition - 1) {
                System.out.print(oddNumbers[i] + ", ");
            } else {
                System.out.print(oddNumbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printFirstEvenNumbers(int[] evenNumbers) {
        printFirstEvenNumbers(evenNumbers, evenNumbers.length);
    }

    private static void printFirstEvenNumbers(int[] evenNumbers, int counter) {
        int endPosition = evenNumbers.length;
        if (counter <= evenNumbers.length) {
            endPosition = counter;
        }
        System.out.print("[");
        for (int i = 0; i < endPosition; i++) {
            if (i != endPosition - 1) {
                System.out.print(evenNumbers[i] + ", ");
            } else {
                System.out.print(evenNumbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printLastNNumbers(int[] numbers, String type, int counter) {
        if (type.equals("even")) {
            int[] evenNumbers = getEvenNumbers(numbers);
            if (evenNumbers.length > counter) {
                printLastEvenNumbers(evenNumbers, counter);
            } else {
                printLastEvenNumbers(evenNumbers);
            }
        } else if (type.equals("odd")) {
            int[] oddNumbers = getOddNumbers(numbers);
            if (oddNumbers.length > counter) {
                printLastOddNumbers(oddNumbers, counter);
            } else {
                printLastOddNumbers(oddNumbers);
            }
        }
    }

    private static void printLastOddNumbers(int[] oddNumbers) {
        printLastEvenNumbers(oddNumbers, 0);
    }

    private static void printLastOddNumbers(int[] oddNumbers, int counter) {
        int startPosition = 0;
        if (counter > 0) {
            startPosition = oddNumbers.length - counter;
        }
        System.out.print("[");
        for (int i = startPosition; i < oddNumbers.length; i++) {
            if (i != oddNumbers.length - 1) {
                System.out.print(oddNumbers[i] + ", ");
            } else {
                System.out.print(oddNumbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printLastEvenNumbers(int[] evenNumbers, int counter) {
        int startPosition = 0;
        if (counter > 0) {
            startPosition = evenNumbers.length - counter;
        }
        System.out.print("[");
        for (int i = startPosition; i < evenNumbers.length; i++) {
            if (i != evenNumbers.length - 1) {
                System.out.print(evenNumbers[i] + ", ");
            } else {
                System.out.print(evenNumbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printLastEvenNumbers(int[] evenNumbers) {
        printLastEvenNumbers(evenNumbers, 0);
    }

    private static int[] getOddNumbers(int[] numbers) {
        int oddCounter = 0;
        for(int number : numbers) {
            if (number % 2 != 0) oddCounter++;
        }
        int[] oddNumbers = new int[oddCounter];
        int counter = 0;
        for(int number : numbers) {
            if (number % 2 != 0){
                oddNumbers[counter] = number;
                counter++;
            }
        }

        return oddNumbers;
    }

    private static int[] getEvenNumbers(int[] numbers) {
        int evenCounter = 0;
        for(int number : numbers) {
            if (number % 2 == 0) evenCounter++;
        }
        int[] evenNumbers = new int[evenCounter];
        int counter = 0;
        for(int number : numbers) {
            if (number % 2 == 0){
                evenNumbers[counter] = number;
                counter++;
            }
        }

        return evenNumbers;
    }

    private static void printMinElementIndex(int[] numbers, String evenOrOdd) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean foundMin = false;
        for (int i = 0; i < numbers.length; i++) {
            if (evenOrOdd.equals("even") && checkIsEven(numbers[i]) && numbers[i] <= min) {
                min = numbers[i];
                minIndex = i;
                foundMin = true;
            } else if (evenOrOdd.equals("odd") && checkIsOdd(numbers[i]) && numbers[i] <= min) {
                min = numbers[i];
                minIndex = i;
                foundMin = true;
            }
        }

        if (foundMin) {
            System.out.println(minIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMaxElementIndex(int[] numbers, String evenOrOdd) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        boolean foundMax = false;
        for (int i = 0; i < numbers.length; i++) {
            if (evenOrOdd.equals("even") && checkIsEven(numbers[i]) && numbers[i] >= max) {
                max = numbers[i];
                maxIndex = i;
                foundMax = true;
            } else if (evenOrOdd.equals("odd") && checkIsOdd(numbers[i]) && numbers[i] >= max) {
                max = numbers[i];
                maxIndex = i;
                foundMax = true;
            }
        }

        if (foundMax) {
            System.out.println(maxIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static boolean checkIsEven(int number) {

        return number % 2 == 0;
    }

    private static boolean checkIsOdd(int number) {

        return number % 2 != 0;
    }

    private static int[] exchangeArrayAtIndex(int[] numbers, int index) {
        int[] exchangedArray = numbers;

        for (int i = 0; i <= index; i++) {

            int first = exchangedArray[0];

            for (int j = 0; j < exchangedArray.length - 1; j++) {
                exchangedArray[j] = exchangedArray[j + 1];
            }
            numbers[numbers.length - 1] = first;
        }

        return exchangedArray;
    }
}
