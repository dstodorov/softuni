package SoftUni.fundamentalsJanuary.regularExpressions.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>(?<product>\\w+)<<(?<price>(\\d*|\\d+.)\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> products = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                products.add(product);
                totalPrice += quantity * price;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String product : products) {
            System.out.println(product);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
