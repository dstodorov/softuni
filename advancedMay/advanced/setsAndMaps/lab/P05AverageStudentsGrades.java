package SoftUni.advancedMay.advanced.setsAndMaps.lab;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String name = studentInfo[0];
            double grade = Double.parseDouble(studentInfo[1]);

            if (students.containsKey(name)) {
                students.get(name).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(name, grades);
            }
        }

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            System.out.print(student.getKey() + " -> ");
            student.getValue().forEach(aDouble -> System.out.printf("%.2f ", aDouble));

            double sum = 0;
            for (int i = 0; i < student.getValue().size(); i++) {
                sum += student.getValue().get(i);
            }
            double avg = sum / student.getValue().size();

            System.out.printf("(avg: %.2f)%n", avg);
        }
    }
}
