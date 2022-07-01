package SoftUni.oop.workingWithAbstraction.lab.studentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> studentsRepository;

    public StudentRepository() {
        this.studentsRepository = new ArrayList<>();
    }

    public List<Student> getStudentsRepository() {
        return this.studentsRepository;
    }

    public void registerStudent(Student student) {
        if (!this.studentsRepository.contains(student)) this.studentsRepository.add(student);
    }

    public void printStudentInformation(String name) {
        this.studentsRepository.stream().filter(s -> s.getName().equals(name)).findFirst().ifPresent(System.out::println);
    }
}
