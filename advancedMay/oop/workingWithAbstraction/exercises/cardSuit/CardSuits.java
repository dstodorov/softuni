package SoftUni.advancedMay.oop.workingWithAbstraction.exercises.cardSuit;

public enum CardSuits {

    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private int intValue;
    private String nameValue;

    CardSuits(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getNameValue() {
        return nameValue;
    }
}