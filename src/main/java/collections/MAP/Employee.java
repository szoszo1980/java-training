package collections.MAP;

public class Employee {

    private long id;

    private String name;

    private String yearOfBirth;

    private int salary;

    public Employee(long id, String name, String yearOfBirth, int salary) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public int getSalary() {
        return salary;
    }
}
