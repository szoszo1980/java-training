package streamsalgorithms;

public class Employee {

    private String name;

    private int yearOfAge;

    public Employee(String name, int yearOfAge) {
        this.name = name;
        this.yearOfAge = yearOfAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfAge=" + yearOfAge +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfAge() {
        return yearOfAge;
    }
}

