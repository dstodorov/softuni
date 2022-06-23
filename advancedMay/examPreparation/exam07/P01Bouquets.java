package SoftUni.advancedMay.examPreparation.exam07;

import java.util.*;

public class P01Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> daffodils = new ArrayDeque<>();
        ArrayDeque<Integer> tulips = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(daffodils::offer);
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(tulips::push);

        int bouquetsCount = 0;
        int storedFlowers = 0;

        Map<String, Integer> map = new LinkedHashMap<>();

        while (!daffodils.isEmpty() && !tulips.isEmpty()) {
            int sum = tulips.peek() + daffodils.peek();

            if (sum == 15) {
                tulips.pop();
                daffodils.poll();
                bouquetsCount++;
            } else if (sum > 15) {
                tulips.push(tulips.pop() - 2);
            } else {
                storedFlowers += sum;
                tulips.pop();
                daffodils.pop();
            }
        }

        bouquetsCount += storedFlowers / 15;

        if (bouquetsCount >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!%n", bouquetsCount);
        } else {
            System.out.printf("You failed... You need more %d bouquets.%n", (5 - bouquetsCount));
        }

    }
}
