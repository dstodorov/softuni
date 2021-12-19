package SoftUni.basics.whileLoop.lab;

import java.util.Scanner;

public class P01Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (true) {
            if (!text.equals("Stop")) {
                System.out.println(text);
                text = scanner.nextLine();
            } else {
                break;
            }
        }
    }
}
