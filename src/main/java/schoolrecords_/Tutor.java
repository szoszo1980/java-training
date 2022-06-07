package schoolrecords_;

import java.util.List;

public class Tutor {

    private String name;

    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTaughtSubjects() {
        return taughtSubjects;
    }
}
