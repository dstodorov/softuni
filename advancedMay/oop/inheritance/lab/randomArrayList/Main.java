package SoftUni.advancedMay.oop.inheritance.lab.randomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> elements = new RandomArrayList<>();
        elements.add("Mitko");
        elements.add("Dobi");
        elements.add("Zara");
        elements.add("Teta");

        System.out.println(elements.getRandomElement());
        System.out.println();
    }
}
