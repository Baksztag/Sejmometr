import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Sejm {
    private List<Deputy> deputies;


    public Sejm(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public String toString() {
        return "Sejm{" +
                "deputies=" + deputies +
                '}';
    }
}
