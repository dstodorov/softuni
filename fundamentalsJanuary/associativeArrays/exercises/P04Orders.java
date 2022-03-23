package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> orders = new LinkedHashMap<>();
        Map<String, Double> products = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] orderDetails = input.split(" ");

            String product = orderDetails[0];
            double price = Double.parseDouble(orderDetails[1]);
            int quantity = Integer.parseInt(orderDetails[2]);

            if (!products.containsKey(product) && !orders.containsKey(product)) {
                products.put(product, price);
                orders.put(product, quantity);
            } else {
                products.put(product, price);
                orders.put(product, orders.get(product) + quantity);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> product : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", product.getKey(), product.getValue() * orders.get(product.getKey()));
        }
    }
}
