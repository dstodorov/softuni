package SoftUni.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String testString = "!!!1!1!0!!!0!1!0!0!!0".replace("!", " ").trim();
        String cleared = "";
        for (int i = 0; i <testString.length(); i++) {
            if (testString.charAt(i) == '0' || testString.charAt(i) == '1') {
                cleared += testString.charAt(i) + " ";
            }
        }

    }
}
