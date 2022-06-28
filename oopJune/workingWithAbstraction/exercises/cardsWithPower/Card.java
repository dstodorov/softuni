package SoftUni.oopJune.workingWithAbstraction.exercises.cardsWithPower;

public class Card {

    public static int calculatePower(String rank, String suit) {
        return CardRanks.valueOf(rank).getIntValue() + CardSuits.valueOf(suit).getIntValue();
    }

}
