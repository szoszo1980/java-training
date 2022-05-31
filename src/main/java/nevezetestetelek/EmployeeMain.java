package nevezetestetelek;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Péter",100_000));
        emp.add(new Employee("Sándor",500_000));
        emp.add(new Employee("Tamás",100_500));

        List<String> name = new ArrayList<>();

        for (Employee e : emp){
            name.add(e.getName()) ;
        }

        System.out.println("Name list: " + name);

        List<Employee> FiteredEmp = new ArrayList<>();

        for (Employee e : emp){
           if (e.getSalary() > 100_000){
               FiteredEmp.add(e);
           }
        }

        for (Employee e : FiteredEmp){
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
        }

    }
}
