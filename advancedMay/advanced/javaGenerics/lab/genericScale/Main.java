package SoftUni.advancedMay.advanced.javaGenerics.lab.genericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("a", "c");
        System.out.println(scale.getHeavier());
        Scale<Integer> scale2 = new Scale<>(1,2);
        System.out.println(scale2.getHeavier());
    }
}
