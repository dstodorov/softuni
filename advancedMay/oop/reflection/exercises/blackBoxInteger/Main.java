package SoftUni.advancedMay.oop.reflection.exercises.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class clazz = BlackBoxInt.class;

        Constructor ctor = clazz.getDeclaredConstructors()[0];
        ctor.setAccessible(true);
        BlackBoxInt myObject = (BlackBoxInt) ctor.newInstance(0);

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String tokens[] = input.split("_");

            int result = getCommandResult(myObject, tokens);

            System.out.println(result);

            input = scanner.nextLine();
        }
    }

    private static int getCommandResult(BlackBoxInt myObject, String[] tokens) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        String command = tokens[0];
        int value = Integer.parseInt(tokens[1]);

        Method operation = myObject.getClass().getDeclaredMethod(command, int.class);
        operation.setAccessible(true);
        operation.invoke(myObject, value);

        Field innerValue = myObject.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);
        Object val = innerValue.get(myObject);

        return (int) val;
    }
}
