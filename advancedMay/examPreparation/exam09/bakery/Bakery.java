package SoftUni.advancedMay.examPreparation.exam09.bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bakery {

    private List<Employee> employees;
    private String name;
    private int capacity;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }


    public void add(Employee employee) {
        if (this.employees.size() < this.capacity) this.employees.add(employee);
    }

    public boolean remove(String name) {
        return this.employees.remove(this.employees.stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null));
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
        sb.append("Employees working at Bakery ").append(this.name).append(":\n");
        this.employees.forEach(e -> sb.append(e).append("\n"));
        return sb.toString().trim();
    }

}
