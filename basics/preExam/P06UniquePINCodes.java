package SoftUni.basics.preExam;

import java.util.Scanner;

public class P06UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstMax = Integer.parseInt(scanner.nextLine());
        int secondMax = Integer.parseInt(scanner.nextLine());
        int thirdMax = Integer.parseInt(scanner.nextLine());

        for (int first = 2; first <= firstMax; first += 2) {
            for (int second = 2; second <= secondMax; second++){
                boolean isSecondPrime = true;
                for (int i = 2; i <= second -1; i++) {
                    if (second % i == 0){
                        isSecondPrime = false;
                        break;
                    }
                }
                for (int third = 2; third <= thirdMax; third+=2) {
                    if (isSecondPrime) System.out.printf("%d %d %d %n", first, second, third);
                }
            }
        }
    }
}
