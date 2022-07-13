package SoftUni.advancedMay.oop.polymorphism.exercises.word;

public class CutTextTransform implements TextTransform {
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        CommandImpl.cutOfText = text.substring(startIndex, endIndex);
        text.delete(startIndex, endIndex);
    }

}
