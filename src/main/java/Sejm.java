import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Sejm {
    private List<Deputy> deputies;
    private int termOfOffice;


    public Sejm(SejmBuilder builder) throws IOException {
        this.deputies = builder.getDeputies();
        this.termOfOffice = builder.getTermOfOffice();
    }

    @Override
    public String toString() {
        return "Sejm{" +
                "deputies=" + deputies +
                '}';
    }

    public void saveDeputiesToTxt() throws IOException{
        PrintWriter out = new PrintWriter("term" + this.termOfOffice + "deputies.txt");
        this.deputies.forEach(deputy -> out.println(deputy.toTxtFile()));
    }
}
