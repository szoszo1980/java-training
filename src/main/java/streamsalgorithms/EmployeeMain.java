package streamsalgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        var employees = new ArrayList<Employee>(List.of(
                new Employee("Szabolcs",1980),
                new Employee("ffsfsdsd",1990),
                new Employee("ffsfsdsd",1995),
                new Employee("ffsfsdsdddddd",1988)
        ));

        System.out.print("Összegezd az alkalmazottak születési éveit!: ");
        System.out.println(employees.stream().mapToInt(e -> e.getYearOfAge()).sum());

        System.out.print("Összegezd az alkalmazottak életkorát!: ");
        System.out.println(employees.stream().mapToInt(e -> 2022 - e.getYearOfAge()).sum());

        System.out.print("Add vissza streammel, hány alkalmazott van a listában!: ");
        System.out.println(employees.stream().count());

        System.out.print("Add vissza, hány alkalmazott született 1990-nél korábban!: ");
        System.out.println(employees.stream().filter(employee -> employee.getYearOfAge() < 1990).count());

        System.out.print("Add vissza a legkorábban született alkalmazott születési évét!: ");
        System.out.println(employees.stream().min(Comparator.comparingInt(employee -> employee.getYearOfAge())).get().getYearOfAge());

        System.out.print("Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst()\n" +
                "záróműveletre.: ");
        System.out.println(employees.stream().min(Comparator.comparingInt(employee -> employee.getYearOfAge())).get().getName());

        System.out.println("Add vissza egy listában az összes alkalmazott nevét!: ");
        employees.forEach(employee -> System.out.println(employee.getName()));
        System.out.println(employees.stream().map(employee -> employee.getName()).collect(Collectors.toList()));

        System.out.print("Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!: ");
        System.out.println(employees.stream().filter(employee -> employee.getYearOfAge() < 1990).map(employee -> employee.getName()).collect(Collectors.toList()));

        System.out.print("Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?: ");
        System.out.println(employees.stream().allMatch(employee -> employee.getYearOfAge() < 1980));

        System.out.print("Azelőző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban\n" +
                "született alkalmazott nevét!: ");
        System.out.println(employees.stream().filter(employee -> employee.getYearOfAge() < 1990).map(employee -> employee.getName()).collect(Collectors.toList()));
    }
}
