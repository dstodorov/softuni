package SoftUni.advancedMay.javaGenerics.exercises.genericBox;

public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n", element.getClass().getName(), element);
    }
}
