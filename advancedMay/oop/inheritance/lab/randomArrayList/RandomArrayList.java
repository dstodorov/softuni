package SoftUni.advancedMay.oop.inheritance.lab.randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {
    public Object getRandomElement() {
        Random random = new Random();
        int randomElementIndex = random.nextInt(super.size());
        Object element = super.get(randomElementIndex);
        super.remove(randomElementIndex);
        return element;
    }
}
