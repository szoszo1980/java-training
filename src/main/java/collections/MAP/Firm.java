package collections.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Firm {
    private long idGenerator;
    private Map<Long,Employee> employees = new HashMap<>();
    public Firm() {
        idGenerator = 0;
    }
    public void hireEmployee(String name,String yearOfBirth,int salary){

        idGenerator = idGenerator + 1;

        var employee = new Employee(idGenerator,name,yearOfBirth,salary);

        employees.put(idGenerator,employee);
    }

    public List<String> getEmployeesIdentityValues(long id){

        var emp = new ArrayList<String>();

        for (Map.Entry entry : employees.entrySet()){
            if (entry.getKey().equals(id)){
                emp.add(((Employee)entry.getValue()).getName());
                emp.add(((Employee)entry.getValue()).getYearOfBirth());
                emp.add(String.valueOf(((Employee)entry.getValue()).getSalary()));
            }
        }

        return emp;
    }

    public String getEmployeeSalary(long id){
        return employees.get(id).getName() + " fizetése: " + employees.get(id).getSalary();
    }


    public static void main(String[] args) {

        Firm firm = new Firm();

        firm.hireEmployee("hfghfghfg","1980.06.06",100_000);
        firm.hireEmployee("hfghfghfg","1980.06.06",200_000);
        firm.hireEmployee("hfghfghfg","1980.06.06",300_000);
        firm.hireEmployee("hfghfghfg","1980.06.06",400_000);
        firm.hireEmployee("hfghfghfg","1980.06.06",500_000);

        System.out.println(firm.getEmployeeSalary(2));
    }
}




