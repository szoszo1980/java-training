package email;


public class Email {
    private String subject;
    private String to;
    private String body;

    public Email() {
    }

    public static void main(String[] args) {

    }

    public String getSubject() {
        return this.subject;
    }

    public String getTo() {
        return this.to;
    }

    public String getBody() {
        return this.body;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Email)) return false;
        final Email other = (Email) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$subject = this.getSubject();
        final Object other$subject = other.getSubject();
        if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject)) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        final Object this$body = this.getBody();
        final Object other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Email;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $subject = this.getSubject();
        result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        final Object $body = this.getBody();
        result = result * PRIME + ($body == null ? 43 : $body.hashCode());
        return result;
    }

    public String toString() {
        return "Email(subject=" + this.getSubject() + ", to=" + this.getTo() + ", body=" + this.getBody() + ")";
    }
}
