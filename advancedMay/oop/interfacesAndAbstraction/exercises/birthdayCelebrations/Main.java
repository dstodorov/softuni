package SoftUni.advancedMay.oop.interfacesAndAbstraction.exercises.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();
        List<Identifiable> robots = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputParams = input.split("\\s+");
            String type = inputParams[0];

            switch (type) {
                case "Citizen":
                    String name = inputParams[1];
                    int age = Integer.parseInt(inputParams[2]);
                    String id = inputParams[3];
                    String birthdate = inputParams[4];
                    Birthable citizen = new Citizen(name, age, id, birthdate);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    String petName = inputParams[1];
                    String petBirthdate = inputParams[2];
                    Birthable pet = new Pet(petName, petBirthdate);
                    birthables.add(pet);
                    break;
                case "Robot":
                    String model = inputParams[1];
                    String robotId = inputParams[2];
                    Identifiable robot = new Robot(model, robotId);
                    robots.add(robot);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();
        birthables.stream().filter(b -> b.getBirthDate().substring(6).equals(year)).forEach(b -> System.out.println(b.getBirthDate()));

    }

}
