package SoftUni.advancedMay.advanced.examPreparation.exam04;

import java.util.*;

public class P01AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        ArrayDeque<Integer> freshnessLevel = new ArrayDeque<>();

        Map<String, Integer> cocktailsPrepared = new TreeMap<>();
        cocktailsPrepared.put("Pear Sour", 0);
        cocktailsPrepared.put("The Harvest", 0);
        cocktailsPrepared.put("Apple Hinny", 0);
        cocktailsPrepared.put("High Fashion", 0);


        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(ingredients::add);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(freshnessLevel::push);

        while (!ingredients.isEmpty() && !freshnessLevel.isEmpty()) {

            int result = ingredients.peek() * freshnessLevel.peek();

            if (ingredients.peek() == 0) {
                ingredients.remove();
            } else {
                switch (result) {
                    case 150:
                        cocktailsPrepared.put("Pear Sour", cocktailsPrepared.get("Pear Sour") + 1);
                        ingredients.poll();
                        freshnessLevel.pop();
                        break;
                    case 250:
                        cocktailsPrepared.put("The Harvest", cocktailsPrepared.get("The Harvest") + 1);
                        ingredients.poll();
                        freshnessLevel.pop();
                        break;
                    case 300:
                        cocktailsPrepared.put("Apple Hinny", cocktailsPrepared.get("Apple Hinny") + 1);
                        ingredients.poll();
                        freshnessLevel.pop();
                        break;
                    case 400:
                        cocktailsPrepared.put("High Fashion", cocktailsPrepared.get("High Fashion") + 1);
                        ingredients.poll();
                        freshnessLevel.pop();
                        break;
                    default:
                        int increasedValue = ingredients.remove() + 5;
                        ingredients.add(increasedValue);
                        freshnessLevel.pop();
                        break;
                }
            }


        }

        boolean cocktailsAreDone = cocktailsPrepared.entrySet().stream().allMatch(e -> e.getValue() > 0);
        if (cocktailsAreDone) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if (!ingredients.isEmpty()) {
            int sum = 0;
            for (Integer ingredient : ingredients) {
                sum += ingredient;
            }
            System.out.println("Ingredients left: " + sum);
        }

        cocktailsPrepared.entrySet().stream().filter(e -> e.getValue() > 0).forEach(e -> System.out.printf(" # %s --> %d%n", e.getKey(), e.getValue()));

    }
}
