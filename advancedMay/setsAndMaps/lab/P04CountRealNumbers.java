package SoftUni.advancedMay.setsAndMaps.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> realNumbers = new LinkedHashMap<>();

        for (double number : numbers) {

            if (realNumbers.containsKey(number)) {
                realNumbers.put(number, realNumbers.get(number) + 1);
            } else {
                realNumbers.put(number, 1);
            }
        }

        realNumbers.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
