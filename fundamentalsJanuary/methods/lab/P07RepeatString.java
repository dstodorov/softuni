package SoftUni.fundamentalsJanuary.methods.lab;

import java.util.Scanner;

public class P07RepeatString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String finalResult = repeatString(text, count);
        System.out.println(finalResult);
    }


    private static String repeatString(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}
