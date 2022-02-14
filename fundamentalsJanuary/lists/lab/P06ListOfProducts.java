package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<String>();
        for (int i = 0; i < numberOfProducts; i++) {
            productsList.add(scanner.nextLine());
        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));
        }
    }
}
