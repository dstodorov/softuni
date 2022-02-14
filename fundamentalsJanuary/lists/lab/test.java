package SoftUni.fundamentalsJanuary.lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Mitko");
        l.add("Dobri");

        l.add(1, "Krasi");
        printList(l);
    }


    static <Type> void printList(List<Type> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
    }
}
