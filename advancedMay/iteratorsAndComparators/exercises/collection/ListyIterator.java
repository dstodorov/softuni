package SoftUni.advancedMay.iteratorsAndComparators.exercises.collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String>{
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

    @Override
    public Iterator<String> iterator() {
        return new InnerIterator();
    }

    private class InnerIterator implements Iterator<String> {
        int innerIndex = 0;
        @Override
        public boolean hasNext() {
            return innerIndex < elements.size();
        }

        @Override
        public String next() {
            return elements.get(innerIndex++);
        }
    }
}
