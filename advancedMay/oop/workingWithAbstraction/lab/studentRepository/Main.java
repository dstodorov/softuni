package SoftUni.oop.workingWithAbstraction.lab.studentRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();

        String[] inputParams = scanner.nextLine().split("\\s+");
        String command = inputParams[0];

        while (!command.equals("Exit")) {

            if (command.equals("Create")) {
                String name = inputParams[1];
                int age = Integer.parseInt(inputParams[2]);
                double grade = Double.parseDouble(inputParams[3]);
                Student student = new Student(name, age, grade);
                studentRepository.registerStudent(student);
            } else if (command.equals("Show")) {
                String name = inputParams[1];
                studentRepository.printStudentInformation(name);
            }

            inputParams = scanner.nextLine().split("\\s+");
            command = inputParams[0];
        }
    }
}
