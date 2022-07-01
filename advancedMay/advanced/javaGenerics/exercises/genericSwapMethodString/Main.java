package SoftUni.advancedMay.advanced.javaGenerics.exercises.genericSwapMethodString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boxes.add(new Box<>(scanner.nextLine()));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        swap(indexes[0], indexes[1], boxes);

        boxes.forEach(System.out::print);
    }

    public static <T> void swap (int index1, int index2, List<Box<T>> elements) {
        Box<T> tempValue = elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, tempValue);
    }
}
