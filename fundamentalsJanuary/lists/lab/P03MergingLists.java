package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> mergedNumberList = new ArrayList<>();

        int counter = Math.max(listOne.size(), listTwo.size());

        for (int i = 0; i < counter; i++) {
            if (i <= listOne.size() - 1) {
                mergedNumberList.add(listOne.get(i));
            }
            if (i <= listTwo.size() - 1) {
                mergedNumberList.add(listTwo.get(i));
            }
        }

        for (int number : mergedNumberList) {
            System.out.print(number + " ");
        }
    }
}
