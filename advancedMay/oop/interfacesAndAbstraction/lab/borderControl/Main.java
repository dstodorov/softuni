package SoftUni.advancedMay.oop.interfacesAndAbstraction.lab.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputParams = input.split("\\s+");
            if (inputParams.length == 3) {
                String name = inputParams[0];
                int age = Integer.parseInt(inputParams[1]);
                String id = inputParams[2];
                Identifiable citizen = new Citizen(name, age, id);
                identifiables.add(citizen);
            } else if (inputParams.length == 2) {
                String id = inputParams[0];
                String model = inputParams[1];
                Identifiable robot = new Robot(id, model);
                identifiables.add(robot);
            }
            input = scanner.nextLine();
        }

        String fakeIdLastDigits = scanner.nextLine();

        printFakeIds(identifiables, fakeIdLastDigits);
    }

    private static void printFakeIds(List<Identifiable> identifiables, String fakeIdLastDigits) {
        identifiables.stream()
                .filter(identifiable -> identifiable.getId().endsWith(fakeIdLastDigits))
                .forEach(e -> System.out.println(e.getId()));
    }
}
