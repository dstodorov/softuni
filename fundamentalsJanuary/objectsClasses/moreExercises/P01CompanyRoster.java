package SoftUni.fundamentalsJanuary.objectsClasses.moreExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] employeeDetails = scanner.nextLine().split(" ");
            String employeeName = employeeDetails[0];
            double employeeSalary = Double.parseDouble(employeeDetails[1]);
            String employeePosition = employeeDetails[2];
            String employeeDepartment = employeeDetails[3];
            String employeeEmail = "n/a";
            int employeeAge = -1;

            if (employeeDetails.length > 5) {
                employeeEmail = employeeDetails[4];
                employeeAge = Integer.parseInt(employeeDetails[5]);
            } else if (employeeDetails.length > 4) {
                try {
                    employeeAge = Integer.parseInt(employeeDetails[4]);
                } catch (Exception e) {
                    employeeEmail = employeeDetails[4];
                }
            }
            Employee employee = new Employee(employeeName, employeeSalary, employeePosition, employeeDepartment, employeeEmail, employeeAge);
            if(isDepartmentExist(departments, employeeDepartment)){
                addEmployee(departments, employee);
            } else {
                createDepartment(departments, employee);
            }
        }

        Department bestDepartment = getBestDepartment(departments);

        bestDepartment.printDepartmentInformation();
    }

    private static Department getBestDepartment(List<Department> departments) {
        double bestAverageSalary = 0;
        String bestAverageSalaryDepartmentName = "";
        Department bestDepartment;
        List<Employee> bestDepartmentEmployees = new ArrayList<>();

        for (Department dept : departments) {
            if (dept.getAverageSalary() > bestAverageSalary) {
                bestAverageSalary = dept.getAverageSalary();
                bestAverageSalaryDepartmentName = dept.getName();
                bestDepartmentEmployees = dept.getEmployees();
            }
        }

        bestDepartment = new Department(bestAverageSalaryDepartmentName, bestDepartmentEmployees);

        return bestDepartment;
    }

    private static void createDepartment(List<Department> departments, Employee employee) {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        Department department = new Department(employee.getDepartment(), employees);
        departments.add(department);
    }

    private static void addEmployee(List<Department> departments, Employee employee) {
        String department = employee.getDepartment();

        for (Department dept : departments) {
            if (dept.getName().equals(department)) {
                dept.addEmployee(employee);
            }
        }
    }

    private static boolean isDepartmentExist(List<Department> departments, String employeeDepartment) {
        for (Department dept : departments) {
            if (dept.getName().equals(employeeDepartment)) {
                return true;
            }
        }
        return false;
    }

    private static class Employee {
        private String name;

        public double getSalary() {
            return salary;
        }

        private double salary;
        private String position;

        public String getDepartment() {
            return department;
        }

        private String department;
        private String email;
        private int age;

        Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
        }
    }

    private static class Department {
        public String getName() {
            return name;
        }

        private String name;

        public List<Employee> getEmployees() {
            return employees;
        }

        private List<Employee> employees;

        Department(String name, List<Employee> employees) {
            this.employees = employees;
            this.name = name;
        }

        public void addEmployee(Employee employee) {
            this.employees.add(employee);
        }

        public double getAverageSalary() {
            int employeeCount = 0;
            double salariesSum = 0;
            for (Employee employee : this.employees) {
                employeeCount++;
                salariesSum += employee.getSalary();
            }
            if (employeeCount > 0) {
                return salariesSum / employeeCount;
            }

            return 0;
        }

        public void printDepartmentInformation() {
            System.out.println("Highest Average Salary: " + this.getName());

            List<Employee> sortedBySalaryEmployeeList = this.employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
            for (Employee employee : sortedBySalaryEmployeeList) {
                System.out.println(employee);
            }
        }
    }
}
