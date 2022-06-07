package schoolrecords_;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void grading(Mark mark){

    }

    public double calculateAvarege(){
        return 0.0;
    }

    public double calculateSubjectAvarege(Subject subject){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }
}
