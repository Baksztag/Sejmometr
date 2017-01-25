import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class SejmBuilderFromTxt implements SejmBuilder {
    private List<Deputy> deputies;
    private int termOfOffice;


    public SejmBuilderFromTxt(int termOfOffice) throws IOException {
        this.termOfOffice = termOfOffice;
        String filename = "term" + this.termOfOffice + "deputies.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        List<Deputy> deputies = new LinkedList<>();
        String line = reader.readLine();
        while (line != null) {
//            System.out.println(line);
            deputies.add(new Deputy
                    (Integer.parseInt(line.split(" ", 2)[0]),
                    line.split(" ", 2)[1]));
            line = reader.readLine();
        }
        this.deputies = deputies;
    }

    @Override
    public List<Deputy> getDeputies() {
        return this.deputies;
    }

    @Override
    public int getTermOfOffice() {
        return this.termOfOffice;
    }
}
