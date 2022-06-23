package SoftUni.advancedMay.examPreparation.exam09;

import java.util.*;
import java.util.stream.Collectors;

public class P01Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(liquids::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(ingredients::push);

        Map<String, Integer> cookedFood = new LinkedHashMap<>();
        cookedFood.put("Bread", 0);
        cookedFood.put("Cake", 0);
        cookedFood.put("Fruit Pie", 0);
        cookedFood.put("Pastry", 0);

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int sum = liquids.peek() + ingredients.peek();

            switch (sum) {
                case 25:
                    cookedFood.put("Bread", cookedFood.get("Bread") + 1);
                    liquids.poll();
                    ingredients.pop();
                    break;
                case 50:
                    cookedFood.put("Cake", cookedFood.get("Cake") + 1);
                    liquids.poll();
                    ingredients.pop();
                    break;
                case 75:
                    cookedFood.put("Pastry", cookedFood.get("Pastry") + 1);
                    liquids.poll();
                    ingredients.pop();
                    break;
                case 100:
                    cookedFood.put("Fruit Pie", cookedFood.get("Fruit Pie") + 1);
                    liquids.poll();
                    ingredients.pop();
                    break;
                default:
                    liquids.poll();
                    ingredients.push(ingredients.pop() + 3);
                    break;
            }
        }

        boolean foundAllFoods = cookedFood.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (foundAllFoods) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        System.out.print("Liquids left: ");
        System.out.print(liquids.isEmpty() ? "none" : liquids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println();
        System.out.print("Ingredients left: ");
        System.out.print(ingredients.isEmpty() ? "none" : ingredients.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println();
        cookedFood.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
