package schoolrecords_;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student name){
        return true;
    }

    public boolean removeStudent(Student name){
        return true;
    }

    public double calculateClassAverage(){
        return 0.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        return 0.0;
    }

    public Optional<Student> findStudentByName(String name){
        return Optional.empty();
    }

    public Student repetition(){
        return null;
    }

    public String listStudentNames(){
        return "";
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public List<Student> getStudents() {
        return students;
    }
}
