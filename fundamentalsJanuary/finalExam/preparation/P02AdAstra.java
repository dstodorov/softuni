package SoftUni.fundamentalsJanuary.finalExam.preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodDetails = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<beginSymbol>[#|])(?<foodName>[A-Za-z ]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>[0-9]{1,4}|10000)\\1");
        Matcher matcher = pattern.matcher(foodDetails);

        int totalCalories = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        matcher.reset();
        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expireDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expireDate, calories);
        }
    }
}