package SoftUni.fundamentals.arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());
        String sequence = scanner.nextLine();

        while (!sequence.equals("Clone them!")) {
            int[] clearedSequence = Arrays.stream(sequence.split("!")).mapToInt(Integer::parseInt).toArray();

            //Елемента с най-много поредни единици
            //Ако са два или повече, да изведен този с по-нисък начален индекс
            //Ако са два или повече с еднакъв начален индекс, да изведем този с най-голяма сума на всички елементи

            //случай 1
            //          1!0!1!1!0
            //          1!0!0!1!0
            //извеждаме 1!0!1!1!0

            //случай 2
            //          1!0!1!1!0
            //          0!1!1!0!1
            //извеждаме 0!1!1!0!1

            //случай 3
            //          1!0!1!1!0!0
            //          1!0!1!1!0!1
            //извеждаме 1!0!1!1!0!1


            sequence = scanner.nextLine();
        }
    }
}
