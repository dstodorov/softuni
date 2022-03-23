package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> sides = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String[] details = input.split("\\|");
                String forceSide = details[0].trim();
                String forceUser = details[1].trim();

                sides.putIfAbsent(forceSide, new ArrayList<>());
                boolean flag = sides.entrySet().stream().noneMatch(entry -> entry.getValue().contains(forceUser));
                if (flag) {
                    sides.get(forceSide).add(forceUser);
                }
            } else if (input.contains("->")) {
                String forceUser = input.split(" -> ")[0].trim();
                String forceSide = input.split(" -> ")[1].trim();

                sides.forEach((k, v) -> v.remove(forceUser));
                sides.putIfAbsent(forceSide, new ArrayList<>());
                sides.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> side : sides.entrySet()) {
            if (side.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", side.getKey(), side.getValue().size());
                for (String user : side.getValue()) {
                    System.out.printf("! %s%n", user);
                }
            }

        }
    }
}
