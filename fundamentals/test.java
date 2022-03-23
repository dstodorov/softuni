package SoftUni.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class test {
    public static void main(String[] args) {
        int num = 5;
        increment(num, 15);
        System.out.println(num);
    }


    public static void increment(int num, int value) {
        num += value;
    }


}
