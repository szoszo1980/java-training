package employees;

import employees.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Szabolcs",100_000);
        emp.increaseSalary(15);
        System.out.println(String.format("Name: %s Salary: %f",emp.getName(),emp.getSalary()));
    }
}
