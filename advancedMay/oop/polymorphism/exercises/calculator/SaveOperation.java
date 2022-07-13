package SoftUni.advancedMay.oop.polymorphism.exercises.calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SaveOperation implements Operation {
    private List<Integer> operands;
    private int result;
    ArrayDeque<Integer> memory;

    public SaveOperation(ArrayDeque<Integer> memory){
        this.operands = new ArrayList<>();
        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {
        this.operands.add(operand);
        if (this.isCompleted()) {
            this.result = this.operands.get(0);
            this.memory.push(this.result);
        }
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 1;
    }

    @Override
    public int getResult() {
        return this.result;
    }
}
