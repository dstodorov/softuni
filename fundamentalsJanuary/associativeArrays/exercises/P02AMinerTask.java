package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int line = 1;

        String resource = "";
        int quantity = 0;

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            if (line % 2 != 0) {
                resource = input;
            } else {
                quantity = Integer.parseInt(input);

                if (!resources.containsKey(resource)) {
                    resources.put(resource, quantity);
                } else {
                    resources.put(resource, resources.get(resource) + quantity);

                    resource = "";
                    quantity = 0;
                }
            }
            line++;
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> occurrence : resources.entrySet()) {
            System.out.printf("%s -> %d%n", occurrence.getKey(), occurrence.getValue());
        }
    }
}
