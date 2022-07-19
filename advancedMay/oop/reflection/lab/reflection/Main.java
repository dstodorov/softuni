package SoftUni.advancedMay.oop.reflection.lab.reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Reflection.class;

        System.out.println(clazz.getName());
        System.out.println(clazz.getSuperclass());
        Class[] interfaces = clazz.getInterfaces();

        Arrays.stream(interfaces).forEach(System.out::println);

        Reflection reflection = (Reflection) clazz.getDeclaredConstructor().newInstance();
        System.out.println(reflection);
    }
}
