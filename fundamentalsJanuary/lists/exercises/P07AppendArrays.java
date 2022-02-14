package SoftUni.fundamentalsJanuary.lists.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());

        List<Integer> outputList = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {
            if (input.get(i).equals(" ")) continue;
            List<Integer> innerList = Arrays.stream(input.get(i).trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            outputList.addAll(innerList);
        }
        printResult(outputList);
    }

    private static void printResult(List<Integer> outputList) {
        for (int number : outputList) {
            System.out.print(number + " ");
        }
    }
}
