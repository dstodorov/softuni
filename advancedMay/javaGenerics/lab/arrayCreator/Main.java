package SoftUni.advancedMay.javaGenerics.lab.arrayCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(13, 69);
        Arrays.stream(arr).forEach(System.out::println);

        String[] arr2 = ArrayCreator.create(String.class, 10, "Pesho");
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
