package SoftUni.advancedMay.oop.encapsulation.exercises.shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");
        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String personEntity : people) {
            String[] personDetails = personEntity.split("=");
            String name = personDetails[0];
            double money = Double.parseDouble(personDetails[1]);
            personMap.put(name, new Person(name, money));
        }

        for (String product : products) {
            String[] productDetails = product.split("=");
            String name = productDetails[0];
            double cost = Double.parseDouble(productDetails[1]);
            productMap.put(name, new Product(name, cost));
        }

        String input = scanner.nextLine();

        try {
            while (!input.equals("END")) {
                String[] saleDetails = input.split(" ");
                String clientName = saleDetails[0];
                String productName = saleDetails[1];
                Person person = personMap.get(clientName);
                Product product = productMap.get(productName);
                person.buyProduct(product);

                input = scanner.nextLine();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        personMap.forEach((key, value) -> {
            System.out.print(key + " - ");
            System.out.println(value.getProducts());
        });
    }
}
