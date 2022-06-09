package functional;

import java.util.function.Predicate;

public class NameCriteria implements Predicate<Employee> {

    private String name;

    public NameCriteria(String name) {
        this.name = name;
    }
/*
    @Override
    public boolean isMatch(Employee employee) {
        return false;
    }
*/
    @Override
    public boolean test(Employee employee) {
        return false;
    }
}
