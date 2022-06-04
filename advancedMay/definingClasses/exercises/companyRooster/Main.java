package SoftUni.advancedMay.definingClasses.exercises.companyRooster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email = "n/a";
            int age = -1;

            if (input.length == 5) {
                try {
                    age = Integer.parseInt(input[4]);
                } catch (NumberFormatException e) {
                    email = input[4];
                }
            } else if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            }

            if (departments.containsKey(department)) {
                Department existingDepartment = departments.get(department);
                existingDepartment.getEmployees().add(new Employee(name, salary, position, department, email, age));
            } else {
                List<Employee> employees = new ArrayList<>();
                employees.add(new Employee(name, salary, position, department, email, age));
                Department newDepartment = new Department(employees);
                departments.put(department, newDepartment);
            }
        }

        String bestDepartment = getBestDepartment(departments);
        System.out.println("Highest Average Salary: " + bestDepartment);
        departments.get(bestDepartment)
                .getEmployees()
                .sort(Comparator.comparing(Employee::getSalary).reversed());
        departments.get(bestDepartment).getEmployees().forEach(employee -> {
            System.out.printf("%s %.2f %s %d %n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        });
    }

    private static String getBestDepartment(Map<String, Department> departments) {
        double topAverageSalary = 0.0;
        String bestDepartment = "";
        for (Map.Entry<String, Department> departmentEntry : departments.entrySet()) {
            double departmentTotalSalaries = departmentEntry.getValue().getEmployees().stream().mapToDouble(Employee::getSalary).sum();
            if (departmentTotalSalaries / departmentEntry.getValue().getEmployees().size() > topAverageSalary) {
                topAverageSalary = departmentTotalSalaries / departmentEntry.getValue().getEmployees().size();
                bestDepartment = departmentEntry.getKey();
            }
        }
        return bestDepartment;
    }
}
