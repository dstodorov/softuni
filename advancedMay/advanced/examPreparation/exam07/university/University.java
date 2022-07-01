package SoftUni.advancedMay.advanced.examPreparation.exam07.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    public List<Student> students;
    public int capacity;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        if (this.students.contains(student)) {
            return "Student is already in the university".trim();
        } else if (this.students.size() < capacity) {
            this.students.add(student);
            return String.format("Added student %s %s", student.getFirstName(), student.getLastName()).trim();
        }
        return "No seats in the university".trim();
    }

    public String dismissStudent(Student student) {
        if (!this.students.contains(student)) {
            return "Student not found".trim();
        }
        String result = String.format("Removed student %s %s", student.getFirstName(), student.getLastName()).trim();
        this.students.remove(student);
        return result.trim();
    }

    public Student getStudent(String firstName, String lastName) {
        return this.students.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        this.students.forEach(s -> sb.append("==Student: First Name = ").append(s.getFirstName())
                .append(", Last Name = ")
                .append(s.getLastName())
                .append(", Best Subject = ")
                .append(s.getBestSubject()).append("\n"));

        return sb.toString().trim();
    }
}
