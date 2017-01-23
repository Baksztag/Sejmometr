/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Links {
    private String self;
    private String next;
    private String last;


    @Override
    public String toString() {
        return "Links{" +
                "self='" + self + '\'' +
                ", next='" + next + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
