package SoftUni.advancedMay.javaGenerics.exercises.genericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<String> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            box.getElements().add(scanner.nextLine());
        }

        String comparedElement = scanner.nextLine();

        System.out.println(box.getGreaterElements(comparedElement));
    }
}
