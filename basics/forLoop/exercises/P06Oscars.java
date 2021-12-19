package SoftUni.basics.forLoop.exercises;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double scoreByAcademy = Double.parseDouble(scanner.nextLine());
        int evaluators = Integer.parseInt(scanner.nextLine());
        double actorScore = scoreByAcademy;
        for (int i = 0; i < evaluators; i++) {
            String evaluatorName = scanner.nextLine();
            double evaluatorScore = Double.parseDouble(scanner.nextLine());
            actorScore += (evaluatorName.length() * evaluatorScore) / 2;

            if (actorScore > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorScore);
                break;
            }
        }
        if (actorScore <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - actorScore);
        }
    }
}
