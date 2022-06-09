package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employees {

    private List<Employee> employees;

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    //public Employee findBy(QueryCriteria queryCriteria){
    public Employee findBy(Predicate<Employee> queryCriteria){
        for(var employee:employees){
            //if (queryCriteria.isMatch(employee)){
            if (queryCriteria.test(employee)){
                return employee;
            }
        }
        throw  new IllegalArgumentException("Not found with name: " + queryCriteria);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
        new Employee("John Doe",1970),
        new Employee("Jane Doe",1980)
        ));

        Employees firm = new Employees(employees);

        firm.findBy(new NameCriteria("John Doe"));

        firm.findBy(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getYearOfBirth() == 1970;
            }
        });

        firm.findBy(employee -> employee.getYearOfBirth() == 1970);
    }

}
