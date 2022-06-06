package SoftUni.advancedMay.definingClasses.exercises.google;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] details = input.split("\\s+");
            String name = details[0];
            String personInfoType = details[1];

            people.putIfAbsent(name, new Person(name, new Company(), new Car(), new ArrayList<Pokemon>(), new ArrayList<Parent>(), new ArrayList<Child>()));
            Person person = people.get(name);

            switch (personInfoType) {
                case "company":
                    String companyName = details[2];
                    String department = details[3];
                    double salary = Double.parseDouble(details[4]);
                    person.getCompany().setName(companyName);
                    person.getCompany().setDepartment(department);
                    person.getCompany().setSalary(salary);
                    break;
                case "pokemon":
                    String pokemonName = details[2];
                    String pokemonType = details[3];
                    person.getPokemonList().add(new Pokemon(pokemonName, pokemonType));
                    break;
                case "parents":
                    String parentName = details[2];
                    String parentBirthday = details[3];
                    person.getParents().add(new Parent(parentName, parentBirthday));
                    break;
                case "children":
                    String childName = details[2];
                    String childBirthday = details[3];
                    person.getChildren().add(new Child(childName, childBirthday));
                    break;
                case "car":
                    String carModel = details[2];
                    int carSpeed = Integer.parseInt(details[3]);
                    person.getCar().setModel(carModel);
                    person.getCar().setSpeed(carSpeed);
                    break;
            }

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        Person person = people.get(name);
        if (person != null) System.out.println(person);


    }
}
