package SoftUni.advancedMay.oop.inheritance.lab.stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        String item = this.data.get(this.data.size() - 1);
        this.data.remove(item);
        return item;
    }

    public String peek() {
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }


}
