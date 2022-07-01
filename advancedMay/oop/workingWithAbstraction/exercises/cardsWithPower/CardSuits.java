package SoftUni.oop.workingWithAbstraction.exercises.cardsWithPower;

public enum CardSuits {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

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