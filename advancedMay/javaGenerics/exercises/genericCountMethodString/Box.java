package SoftUni.advancedMay.javaGenerics.exercises.genericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box<T extends Comparable<T>> {
    private List<T> elements;

    Box() {
        this.elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return elements;
    }

    public long getGreaterElements(T compareElement) {
        return elements.stream().filter(e -> e.compareTo(compareElement) > 0).count();
    }
}
