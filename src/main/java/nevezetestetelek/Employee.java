package nevezetestetelek;

public class Employee {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}
