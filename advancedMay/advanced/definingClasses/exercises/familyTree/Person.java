package SoftUni.advancedMay.advanced.definingClasses.exercises.familyTree;

import java.util.List;

public class Person {

    private String name;
    private String birthdate;
    private List<Parent> parents;
    private List<Child> children;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
