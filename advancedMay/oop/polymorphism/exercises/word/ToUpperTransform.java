package SoftUni.advancedMay.oop.polymorphism.exercises.word;

class ToUpperTransform implements TextTransform {
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex){
        for (int i = startIndex; i < endIndex; i++) {
            text.setCharAt(i, Character.toUpperCase(text.charAt(i)));
        }
    }
}
