package SoftUni.advancedMay.advanced.javaGenerics.exercises.customList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    CustomList() {
        this.elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return elements;
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T tempElement = this.elements.get(firstIndex);
        this.elements.set(firstIndex, this.elements.get(secondIndex));
        this.elements.set(secondIndex, tempElement);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return this.elements.stream().max(T::compareTo).orElse(null);
    }

    public T getMin() {
        return this.elements.stream().min(T::compareTo).orElse(null);
    }
}
