package SoftUni.fundamentalsJanuary.basicSyntax.lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes + 30 > 59 ) {
            hours++;
            minutes = minutes + 30 - 60;
        } else {
            minutes += 30;
        }
        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours,minutes);
    }
}
