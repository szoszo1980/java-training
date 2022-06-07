package schoolrecords_;

public class Mark {

    private Subject subject;

    private Tutor tutor;

    private MarkType markType;

    public Mark(MarkType markType,Subject subject, Tutor tutor ) {
        this.subject = subject;
        this.tutor = tutor;
        this.markType = markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }
}
