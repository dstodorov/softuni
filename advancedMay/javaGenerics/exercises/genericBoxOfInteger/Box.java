package SoftUni.advancedMay.javaGenerics.exercises.genericBoxOfInteger;

public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n", element.getClass().getName(), element);
    }
}
