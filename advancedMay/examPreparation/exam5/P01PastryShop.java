package SoftUni.advancedMay.examPreparation.exam5;

import java.util.*;
import java.util.stream.Collectors;

public class P01PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = new ArrayDeque<>();
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(liquids::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(ingredients::push);

        Map<String, Integer> cockedFoods = new LinkedHashMap<>();
        cockedFoods.put("Biscuit", 0);
        cockedFoods.put("Cake", 0);
        cockedFoods.put("Pie", 0);
        cockedFoods.put("Pastry", 0);

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {

            int sum = liquids.peek() + ingredients.peek();

            switch (sum) {
                case 25:
                    cockedFoods.put("Biscuit", cockedFoods.get("Biscuit") + 1);
                    ingredients.remove();
                    liquids.pop();
                    break;
                case 50:
                    cockedFoods.put("Cake", cockedFoods.get("Cake") + 1);
                    ingredients.remove();
                    liquids.pop();
                    break;
                case 75:
                    cockedFoods.put("Pastry", cockedFoods.get("Pastry") + 1);
                    ingredients.remove();
                    liquids.pop();
                    break;
                case 100:
                    cockedFoods.put("Pie", cockedFoods.get("Pie") + 1);
                    ingredients.remove();
                    liquids.pop();
                    break;
                default:
                    liquids.pop();
                    ingredients.push(ingredients.poll() + 3);
                    break;
            }
        }

        boolean foundAllFoods = cockedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (foundAllFoods) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
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
        cockedFoods.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
