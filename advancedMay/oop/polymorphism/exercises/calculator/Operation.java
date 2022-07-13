package SoftUni.advancedMay.oop.polymorphism.exercises.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
