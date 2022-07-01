package SoftUni.advancedMay.advanced.definingClasses.exercises.familyTree;

public class Parent {
    private String name;
    private String birthdate;

    public Parent(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
