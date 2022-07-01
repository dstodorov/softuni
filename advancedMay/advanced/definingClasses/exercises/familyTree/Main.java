package SoftUni.advancedMay.advanced.definingClasses.exercises.familyTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setChildren(new ArrayList<>());
        person.setParents(new ArrayList<>());

        Map<String, String> people = new LinkedHashMap<>();
        List<Relationship> relationships = new ArrayList<>();
        String inputData = scanner.nextLine();
        if (inputData.contains("/")) {
            person.setBirthdate(inputData);
        } else {
            person.setName(inputData);
        }

        inputData = scanner.nextLine();

        while (!inputData.equals("End")) {
            if (!inputData.contains("-")) {
                String[] details = inputData.split("\\s+");
                String firstName = details[0];
                String lastName = details[1];
                String birthdate = details[2];
                people.putIfAbsent(firstName + " " + lastName, birthdate);
            } else {
                String[] details = inputData.split(" - ");
                String firstPersonDetail = details[0];
                String secondPersonDetail = details[1];
                relationships.add(new Relationship(firstPersonDetail, secondPersonDetail));
            }

            inputData = scanner.nextLine();
        }
        if (person.getName() == null) {
            people.forEach((k, v) -> {
                if (v.equals(person.getBirthdate())) person.setName(k);
            });
        } else {
            person.setBirthdate(people.get(person.getName()));
        }

        relationships.forEach(relationship -> {
            String parentName;
            String parentBirthdate;
            String childName;
            String childBirthdate;

            if (relationship.getFirstPersonDetail().contains("/")) {
                parentName = getKey(people, relationship.getFirstPersonDetail());
            } else {
                parentName = relationship.getFirstPersonDetail();
            }
            parentBirthdate = people.get(parentName);

            if (relationship.getSecondPersonDetail().contains("/")) {
                childName = getKey(people, relationship.getSecondPersonDetail());
            } else {
                childName = relationship.getSecondPersonDetail();
            }
            childBirthdate = people.get(childName);

            if (parentName != null && parentName.equals(person.getName())) {
                person.getChildren().add(new Child(childName, childBirthdate));
            } else if (childName != null && childName.equals(person.getName())) {
                person.getParents().add(new Parent(parentName, parentBirthdate));
            }
        });

        System.out.println(person.getName() + " " + person.getBirthdate());
        System.out.println("Parents:");
        person.getParents().forEach(parent -> System.out.println(parent.getName() + " " + parent.getBirthdate()));
        System.out.println("Children:");
        person.getChildren().forEach(child -> System.out.println(child.getName() + " " + child.getBirthdate()));

    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        return map.entrySet().stream()
                .filter(entry -> value.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }
}
