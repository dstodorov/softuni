package SoftUni.fundamentalsJanuary.basicSyntax.moreExercises;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String normalString = scanner.nextLine();
        String reversed = "";
        for(int i = normalString.length()-1; i >= 0; i--) {
            reversed += normalString.charAt(i);
        }
        System.out.println(reversed);
    }
}
