package SoftUni.advancedMay.oop.polymorphism.exercises.word;

public class PasteTextTransform implements TextTransform {
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        text.delete(startIndex, endIndex);
        text.insert(startIndex, CommandImpl.cutOfText);
    }
}
