package SoftUni.basics.nestedLoops.exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());
        int totalTopics = 0;
        double totalAverageGrade = 0;

        while (true) {
            String topic = scanner.nextLine();
            if (topic.equals("Finish")) {
                System.out.printf("Student's final assessment is %.2f.%n", totalAverageGrade / totalTopics);
                break;
            } else {
                totalTopics++;
                double averageGrade = 0;
                for (int i = 0; i < judges; i++) {
                    double grade = Double.parseDouble(scanner.nextLine());
                    averageGrade += grade;
                }
                totalAverageGrade += averageGrade / judges;
                System.out.printf("%s - %.2f.%n", topic, averageGrade / judges);
            }
        }
    }
}
