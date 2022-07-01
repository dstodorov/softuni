package SoftUni.advancedMay.advanced.definingClasses.exercises.opinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personInformation = scanner.nextLine().split("\\s+");
            people.add(new Person(personInformation[0], Integer.parseInt(personInformation[1])));
        }

        people.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));
    }
}
