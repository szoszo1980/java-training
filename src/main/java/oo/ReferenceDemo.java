package oo;

import java.util.ArrayList;
import java.util.List;

public class ReferenceDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("jane","Jack"));

        List<String> employees = names;
        employees.set(1,"John");
        System.out.println(names);
    }
}
