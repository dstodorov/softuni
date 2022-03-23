package SoftUni.fundamentalsJanuary.objectsClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        boolean isFrom(String city) {
            return this.hometown.equals(city);
        }
        public String getInfo() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] studentInfo = input.split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            int age = Integer.parseInt(studentInfo[2]);
            String hometown = studentInfo[3];

            Student student = new Student(firstName, lastName, age, hometown);
            students.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        printStudentsFrom(students, city);

    }

    private static void printStudentsFrom(List<Student> students, String city) {
        for (Student student : students) {
            if (student.isFrom(city)) {
                String studentInfo = student.getInfo();
                System.out.println(studentInfo);
            }
        }
    }
}
