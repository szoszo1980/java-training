package streamalgorithms;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {

        var employees = new ArrayList<Employee>(List.of(
                new Employee("fsdfsdf",1980),
                new Employee("fsdfsdf",1981),
                new Employee("fsdfsdf",1982),
                new Employee("fsdfsdf",1983),
                new Employee("fsdfsdf",1984)
        ));

        //System.out.println(employees);

        System.out.println("Alkalmazozttak születési éve összegezve:");
        System.out.println(employees.stream().mapToInt(e -> e.getYearOfBirth()).sum());

        System.out.println("Alkalmazozttak életkora összegezve:");
        System.out.println(employees.stream().mapToInt(e -> (2022 - e.getYearOfBirth())).sum());

        System.out.println("Alkalmazozttak listája:");
        employees.stream().toList().forEach(e -> System.out.println(e.getName()));

        System.out.println("Hány alkalmazoztt van a listában:");
        employees.stream().count();


    }
}
