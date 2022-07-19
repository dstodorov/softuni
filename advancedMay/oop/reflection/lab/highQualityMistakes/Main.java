package SoftUni.advancedMay.oop.reflection.lab.highQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Reflection.class;

        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields).sorted(Comparator.comparing(Field::getName)).forEach(f -> {
            int modifier = f.getModifiers();
            if (!Modifier.isPrivate(modifier)) System.out.printf("%s must be private!%n", f.getName());
        });

        Method[] getters = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Arrays.stream(getters).forEach(getter -> {
            int modifier = getter.getModifiers();
            if (!Modifier.isPublic(modifier)) System.out.printf("%s have to be public!%n", getter.getName());
        });
        Method[] setters = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> m.getName().startsWith("set") && m.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        Arrays.stream(setters).forEach(getter -> {
            int modifier = getter.getModifiers();
            if (!Modifier.isPrivate(modifier)) System.out.printf("%s have to be private!%n", getter.getName());
        });
    }
}
