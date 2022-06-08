package streamsalgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        var employees = new ArrayList<Employee>(List.of(
                new Employee("Szabolcs",1980),
                new Employee("ffsfsdsd",1990),
                new Employee("ffsfsdsd",1995),
                new Employee("ffsfsdsd",1988)
        ));

        System.out.print("Alkalmazottak születési éve összegezve: ");
        System.out.println(employees.stream().mapToInt(e -> e.getYearOfAge()).sum());

        System.out.print("Alkalmazottak életkor szerint összegezve: ");
        System.out.println(employees.stream().mapToInt(e -> 2022 - e.getYearOfAge()).sum());

        System.out.print("Alkalmazottak száma: ");
        System.out.println(employees.stream().count());

        System.out.print("Alkalmazottak száma 1990 előtt született: ");
        System.out.println(employees.stream().filter(employee -> employee.getYearOfAge() < 1990).count());

        System.out.print("Legkorábban született alkalmazott éve: ");
        System.out.println(employees.stream().min(Comparator.comparingInt(employee -> employee.getYearOfAge())).get().getYearOfAge()
        );


    }
}
