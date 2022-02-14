package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) < 0) {
                listOfNumbers.remove(i--);
            }
        }

        Collections.reverse(listOfNumbers);
        if (listOfNumbers.isEmpty()) System.out.println("empty");
        else for (int number : listOfNumbers) System.out.print(number + " ");
    }
}
