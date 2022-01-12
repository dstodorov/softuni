package SoftUni.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class test {
    public static void main(String[] args) {
        //Java 7
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running in Runnable thread");
//            }
//        };
//
//        r.run();
//        System.out.println("Running in main thread");

        //Java 8
//        Runnable r = () -> {
//            System.out.println("Running in Runnable thread");
//        };
//
//        r.run();
//        System.out.println("Running in main thread");

        List<Integer> numbers = Arrays.asList(11,1,23,24,123,152);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}
