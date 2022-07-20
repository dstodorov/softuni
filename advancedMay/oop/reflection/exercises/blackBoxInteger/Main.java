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

        Method add = myObject.getClass().getDeclaredMethod("add", int.class);
        Method subtract = myObject.getClass().getDeclaredMethod("subtract", int.class);
        Method multiply = myObject.getClass().getDeclaredMethod("multiply", int.class);
        Method divide = myObject.getClass().getDeclaredMethod("divide", int.class);
        Method leftShift = myObject.getClass().getDeclaredMethod("leftShift", int.class);
        Method rightShift = myObject.getClass().getDeclaredMethod("rightShift", int.class);
        add.setAccessible(true);
        subtract.setAccessible(true);
        multiply.setAccessible(true);
        divide.setAccessible(true);
        leftShift.setAccessible(true);
        rightShift.setAccessible(true);

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String tokens[] = input.split("_");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            switch (command) {
                case "add":
                    add.invoke(myObject, value);
                    break;
                case "subtract":
                    subtract.invoke(myObject, value);
                    break;
                case "multiply":
                    multiply.invoke(myObject, value);
                    break;
                case "divide":
                    divide.invoke(myObject, value);
                    break;
                case "leftShift":
                    leftShift.invoke(myObject, value);
                    break;
                case "rightShift":
                    rightShift.invoke(myObject, value);
                    break;
            }

            Field innerValue = myObject.getClass().getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            Object val = innerValue.get(myObject);
            System.out.println(val);

            input = scanner.nextLine();
        }


    }
}
