package SoftUni.advancedMay.advanced.examPreparation.exam05.cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (this.employees.size() < this.capacity) employees.add(employee);
    }

    public boolean removeEmployee(String name) {
        Employee employee = this.employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);

        return this.employees.remove(employee);
    }

    public Employee getOldestEmployee() {
        return this.employees.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }

    public Employee getEmployee(String name) {
        return this.employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.employees.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employees working at Cafe ").append(this.name).append(":").append("\n");
        this.employees.forEach(e -> sb.append(e).append("\n"));
        return sb.toString().trim();
    }
}
