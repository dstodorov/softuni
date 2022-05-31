package SoftUni.advancedMay.functionalProgramming.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String[] command = input.split(" ");
            String param = command[1];
            String paramValue = command[2];
            List<String> filteredNames = new ArrayList<>();
            if (command[0].equals("Double")) {
                if (param.equals("StartsWith")) {
                    filteredNames = guests.stream().filter(name -> name.startsWith(paramValue)).collect(Collectors.toList());
                } else if (param.equals("EndsWith")) {
                    filteredNames = guests.stream().filter(name -> name.endsWith((paramValue))).collect(Collectors.toList());
                } else if (param.equals("Length")) {
                    filteredNames = guests.stream().filter(name -> name.length() == Integer.parseInt(paramValue)).collect(Collectors.toList());
                }
                guests.addAll(filteredNames);
            } else if (command[0].equals("Remove")) {
                if (param.equals("StartsWith")) {
                    filteredNames = guests.stream().filter(name -> name.startsWith(paramValue)).collect(Collectors.toList());
                } else if (param.equals("EndsWith")) {
                    filteredNames = guests.stream().filter(name -> name.endsWith((paramValue))).collect(Collectors.toList());
                } else if (param.equals("Length")) {
                    filteredNames = guests.stream().filter(name -> name.length() == Integer.parseInt(paramValue)).collect(Collectors.toList());
                }
                guests.removeAll(filteredNames);
            }

            input = scanner.nextLine();
        }

        Collections.sort(guests);
        if (guests.size() != 0) {
            System.out.println(String.join(", ", guests + " are going to the party!").replaceAll("[\\[|\\]]", ""));
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
