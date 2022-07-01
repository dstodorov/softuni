package SoftUni.advancedMay.advanced.javaGenerics.lab.arrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public static <T> T[] create(int length, T defValue) {
        T[] array = (T[]) Array.newInstance(defValue.getClass(), length);
        Arrays.fill(array, defValue);

        return array;
    }

    public static <T> T[] create (Class<T> clazz, int length, T defValue) {
        T[] array = (T[]) Array.newInstance(clazz, length);
        Arrays.fill(array, defValue);

        return array;
    }
}
