import java.io.*;
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
        File file = new File("term" + this.termOfOffice + "deputies.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for(Deputy deputy : deputies) {
            writer.write(deputy.toTxtFile());
            writer.newLine();
        }
        writer.close();
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public int getTermOfOffice() {
        return termOfOffice;
    }
}
