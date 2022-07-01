package SoftUni.advancedMay.advanced.javaGenerics.exercises.genericSwapMethodInteger;

public class Box<T> {
    private T element;

    Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n", element.getClass().getName(), element);
    }
}
