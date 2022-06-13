package SoftUni.advancedMay.iteratorsAndComparators.exercises.listyIterator;

import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int index;

    public ListyIterator(List<String> elements) {
        if (elements.isEmpty()) {
            this.index = -1;
        } else {
            this.index = 0;
        }
        this.elements = elements;
    }

    public List<String> getElements() {
        return elements;
    }

    public boolean move() {
        if (index < this.elements.size() - 1) {
            index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.elements.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(this.index));
        }
    }

    public boolean hasNext() {
        return index < elements.size() - 1;
    }
}
