package SoftUni.advancedMay.oop.reflection.exercises.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class clazz = RichSoilLand.class;

        Field[] fields = clazz.getDeclaredFields();

        String inputModifier = scanner.nextLine();

        while (!inputModifier.equals("HARVEST")) {

            String finalInputModifier = inputModifier;
            Arrays.stream(fields).forEach(field -> {
                int modifiers = field.getModifiers();
                if (Modifier.toString(modifiers).equals(finalInputModifier) || finalInputModifier.equals("all")) {
                    System.out.printf("%s %s %s%n", Modifier.toString(modifiers), field.getType().getSimpleName(), field.getName());
                }
            });
            inputModifier = scanner.nextLine();
        }

    }
}
