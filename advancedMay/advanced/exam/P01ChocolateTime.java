package SoftUni.advancedMay.advanced.exam;

import java.util.*;

public class P01ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).forEach(milk::offer);
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).forEach(cacao::push);

        Map<String, Integer> chocolateTypes = new TreeMap<>();
        chocolateTypes.put("Milk Chocolate", 0);
        chocolateTypes.put("Dark Chocolate", 0);
        chocolateTypes.put("Baking Chocolate", 0);


        while (!milk.isEmpty() && !cacao.isEmpty()) {
            double firstMilk = milk.peek();
            double lastCacao = cacao.peek();

            double sum = firstMilk + lastCacao;
            double result = (lastCacao / sum) * 100;

            if (result == 30.0) {
                chocolateTypes.put("Milk Chocolate", chocolateTypes.get("Milk Chocolate") + 1);
                milk.poll();
                cacao.pop();
            } else if (result == 50.0) {
                chocolateTypes.put("Dark Chocolate", chocolateTypes.get("Dark Chocolate") + 1);
                milk.poll();
                cacao.pop();
            } else if ((int) result == 100) {
                chocolateTypes.put("Baking Chocolate", chocolateTypes.get("Baking Chocolate") + 1);
                milk.poll();
                cacao.pop();
            } else {
                cacao.pop();
                milk.offer(milk.poll() + 10);
            }
        }


        if (chocolateTypes.entrySet().stream().allMatch(e -> e.getValue() > 0)) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocolateTypes.entrySet().stream().filter(e -> e.getValue() > 0).forEach(e -> System.out.printf("# %s --> %d%n", e.getKey(), e.getValue()));
    }
}
