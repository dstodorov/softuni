package SoftUni.fundamentalsJanuary.midExam.preparation;

import java.util.*;
import java.util.stream.Collectors;

public class P10Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double averageValueOfNumbers = getAverageValue(numbers);

        List<Integer> greaterNumbers = new ArrayList<>();
        getGreaterNumbers(numbers, greaterNumbers, averageValueOfNumbers);
        Collections.sort(greaterNumbers);

        if (greaterNumbers.size() > 1 && greaterNumbers.size() < 5) {
            printNumbers(greaterNumbers);
        } else if (numbers.size() == 1 || greaterNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            printNumbers(greaterNumbers);
        }
    }

    private static void printNumbers(List<Integer> greaterNumbers) {
        int top = 0;
        for (int i = greaterNumbers.size() - 1; i >= 0; i--) {
            System.out.print(greaterNumbers.get(i) + " ");
            top++;
            if (top == 5) break;
        }
    }

    private static void getGreaterNumbers(List<Integer> numbers, List<Integer> greaterNumbers, double averageValueOfNumbers) {
        for (int number : numbers) {
            if (number > averageValueOfNumbers) greaterNumbers.add(number);
        }
    }

    private static double getAverageValue(List<Integer> numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.size();
    }
}

