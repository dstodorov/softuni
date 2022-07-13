package SoftUni.advancedMay.oop.polymorphism.exercises.calculator;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine calculationEngine) {
        return new InputInterpreter(calculationEngine);
    }
}
