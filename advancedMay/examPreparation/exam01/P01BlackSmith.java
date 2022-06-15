package SoftUni.advancedMay.examPreparation.exam01;

import java.util.*;
import java.util.stream.Collectors;

public class P01BlackSmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] steelInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] carbonInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, String> swords = new LinkedHashMap<>();
        swords.put(70, "Gladius");
        swords.put(80, "Shamshir");
        swords.put(90, "Katana");
        swords.put(110, "Sabre");

        Map<String, Integer> forgedSwords = new TreeMap<>();

        ArrayDeque<Integer> steel = new ArrayDeque<>();
        for (int i = 0; i < steelInput.length; i++) {
            steel.add(steelInput[i]);
        }

        ArrayDeque<Integer> carbon = new ArrayDeque<>();
        for (int i = 0; i < carbonInput.length; i++) {
            carbon.push(carbonInput[i]);
        }


        while (!steel.isEmpty() && !carbon.isEmpty()) {
            int firstSteel = steel.peek();
            int lastCarbon = carbon.peek();
            int sum = firstSteel + lastCarbon;

            if (swords.containsKey(sum)) {
                steel.pop();
                carbon.poll();
                if (forgedSwords.containsKey(swords.get(sum))) {
                    forgedSwords.put(swords.get(sum), forgedSwords.get(swords.get(sum)) + 1);
                } else {
                    forgedSwords.put(swords.get(sum), 1);
                }
            } else {
                steel.pop();
                carbon.push(carbon.poll() + 5);
            }

        }
        if (forgedSwords.size() > 0) {
            int totalForgedSwords = forgedSwords.values().stream().reduce(0, Integer::sum);
            System.out.println("You have forged " + totalForgedSwords + " swords.");
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        if (!steel.isEmpty()) {
            System.out.print("Steel left: ");
            List<String> elements = steel.stream().map(String::valueOf).collect(Collectors.toList());
            System.out.print(String.join(", ", elements));
            System.out.println();
        } else {
            System.out.println("Steel left: none");
        }

        if (!carbon.isEmpty()) {
            System.out.print("Carbon left: ");
            List<String> elements = carbon.stream().map(String::valueOf).collect(Collectors.toList());
            System.out.print(String.join(", ", elements));
            System.out.println();
        } else {
            System.out.println("Carbon left: none");
        }

        forgedSwords.entrySet()
                .stream()
                .filter(e -> e.getValue() > 0)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
