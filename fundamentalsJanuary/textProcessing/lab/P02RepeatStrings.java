package SoftUni.fundamentalsJanuary.textProcessing.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split(" ");

        List<String> output = new ArrayList<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                output.add(word);
            }
        }
        System.out.println(String.join("", output));
    }
}
