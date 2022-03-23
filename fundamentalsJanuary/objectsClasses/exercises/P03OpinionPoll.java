package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        getPersonsAbove30(scanner, n, persons);

        Collections.sort(persons);

        printPersonsList(persons);
    }

    private static void printPersonsList(List<Person> personsSorted) {
        for (Person p : personsSorted) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }

    private static void getPersonsAbove30(Scanner scanner, int n, List<Person> persons) {
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            if (age > 30) {
                Person person = new Person(name, age);
                persons.add(person);
            }
        }
    }

    private static class Person implements Comparable<Person> {
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person p) {
            return this.getName().compareTo(p.getName());
        }
    }
}
