package SoftUni.fundamentalsJanuary.associativeArrays.exercises;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (students.containsKey(studentName)) {
                students.get(studentName).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(studentName, grades);
            }
        }

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            double sumOfGrades = 0;
            double averageGrade = 0;
            for (double studentGrade : student.getValue()) {
                sumOfGrades += studentGrade;
            }
            averageGrade = sumOfGrades / student.getValue().size();
            if (averageGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", student.getKey(), averageGrade);
            }
        }

    }
}
