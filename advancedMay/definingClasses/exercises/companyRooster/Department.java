package SoftUni.advancedMay.definingClasses.exercises.companyRooster;

import java.util.List;

public class Department {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department(List<Employee> employees) {
        this.employees = employees;
    }
}
