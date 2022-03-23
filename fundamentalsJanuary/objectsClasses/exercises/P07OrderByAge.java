package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] personDetails = input.split(" ");

            String personName = personDetails[0];
            String personId = personDetails[1];
            int personAge = Integer.parseInt(personDetails[2]);

            personList.add(new Person(personName, personId, personAge));

            input = scanner.nextLine();
        }

        List<Person> sortedPersonList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        printPersonList(sortedPersonList);
    }

    private static void printPersonList(List<Person> sortedPersonList) {
        for (Person p : sortedPersonList) {
            System.out.println(p);
        }
    }

    private static class Person {
        private String name;
        private String id;
        private int age;

        public int getAge() {
            return age;
        }

        public Person(String personName, String personId, int personAge) {
            this.name = personName;
            this.id = personId;
            this.age = personAge;
        }


        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
