package SoftUni.advancedMay.oop.polymorphism.exercises.calculator;

public class InputInterpreter {
    private CalculationEngine engine;

    public InputInterpreter(CalculationEngine engine) {
        this.engine = engine;
    }

    public void interpret(String input) {
        if (input.equals("mr")) {
            Integer lastElement = this.engine.getMemory().pop();
            engine.pushNumber(lastElement);
        } else {
            try {
                engine.pushNumber(Integer.parseInt(input));
            } catch (Exception ex) {
                engine.pushOperation(this.getOperation(input));
            }
        }
    }

    public Operation getOperation(String operation) {
        if (operation.equals("*")) {
            return new MultiplicationOperation();
        } else if (operation.equals("/")) {
            return new DivideOperation();
        } else if (operation.equals("ms")) {
            return new SaveOperation(this.engine.getMemory());
        }

        return null;
    }
}
