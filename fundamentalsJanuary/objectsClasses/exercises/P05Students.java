package SoftUni.fundamentalsJanuary.objectsClasses.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentInformation = scanner.nextLine().split(" ");

            String firstName = studentInformation[0];
            String lastName = studentInformation[1];
            double grade = Double.parseDouble(studentInformation[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        List<Student> sortedListOfStudents = students.stream().sorted(Comparator.comparing(Student::getGrade).reversed()).collect(Collectors.toList());

        printStudentsList(sortedListOfStudents);
    }

    private static void printStudentsList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static class Student {

        private String firstName;
        private String lastName;
        private double grade;

        public double getGrade() {
            return grade;
        }


        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
