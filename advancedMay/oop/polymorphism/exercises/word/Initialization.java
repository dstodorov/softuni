package SoftUni.advancedMay.oop.polymorphism.exercises.word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder stringBuilder) {
        CommandImpl commandImpl = new CommandImpl(stringBuilder);
        commandImpl.init();
        return commandImpl;
    }
}
