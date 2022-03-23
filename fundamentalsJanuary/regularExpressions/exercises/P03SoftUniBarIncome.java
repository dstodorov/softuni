package SoftUni.fundamentalsJanuary.regularExpressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.\\d]*(?<price>\\d*|\\d+.\\d+)\\$");
        Pattern namePattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%");
        Pattern productPattern = Pattern.compile("<(?<product>\\w+)>");
        Pattern quantityPattern = Pattern.compile("\\|(?<quantity>\\d+)\\|");
        Pattern pricePattern = Pattern.compile("(?<price>\\d*|\\d+.\\d+)\\$");

        double totalIncome = 0;

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalIncome += quantity * price;
                System.out.printf("%s: %s - %.2f%n", name, product, quantity * price);
            }


            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
