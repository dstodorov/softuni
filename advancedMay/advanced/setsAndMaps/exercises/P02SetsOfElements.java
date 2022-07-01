package SoftUni.advancedMay.advanced.setsAndMaps.exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsLength = scanner.nextLine().split(" ");

        int n = Integer.parseInt(stringsLength[0]);
        int m = Integer.parseInt(stringsLength[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= n + m; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i <= n) firstSet.add(number);
            else secondSet.add(number);
        }


        firstSet.forEach(number -> {
            if (secondSet.contains(number)) {
                System.out.print(number + " ");
            }
        });
    }
}
