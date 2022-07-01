package SoftUni.advancedMay.advanced.javaGenerics.lab.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();

        jar.add("Mitko");
        String removedElement = jar.remove();
    }
}
