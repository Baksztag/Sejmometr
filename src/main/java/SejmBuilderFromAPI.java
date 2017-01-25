import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import utils.DataContainer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class SejmBuilderFromAPI implements SejmBuilder {
    private List<Deputy> deputies;
    private int termOfOffice;


    public SejmBuilderFromAPI(int termOfOffice) throws IOException {
        List<Deputy> deputies = new LinkedList<>();

        Gson gson = new Gson();
        URL url = new URL("https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=" + termOfOffice);
        DataContainer res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DataContainer.class);
        while (res.getLinks().getNext() != null) {
            res.getDataobject().forEach(dataobject -> {
                deputies.add(new Deputy(dataobject.getId(), dataobject.getData().getName()));
            });
            url = new URL(res.getLinks().getNext().replace("\\", ""));
            res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DataContainer.class);
        }
        res.getDataobject().forEach(dataobject -> {
            deputies.add(new Deputy(dataobject.getId(), dataobject.getData().getName()));
        });

        this.deputies = deputies;
        this.termOfOffice = termOfOffice;
    }

    @Override
    public List<Deputy> getDeputies() {
        return this.deputies;
    }

    public int getTermOfOffice() {
        return termOfOffice;
    }
}
