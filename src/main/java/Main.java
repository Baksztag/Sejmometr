import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import utils.DataContainer;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Main {
    public static void main(String[] args) {
        try {
            List<Deputy> deputies = new LinkedList<>();

            Gson gson = new Gson();
            URL url = new URL("https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=8");
            DataContainer res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DataContainer.class);
            while (res.getLinks().getNext() != null) {
                url = new URL(res.getLinks().getNext().replace("\\", ""));
                res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DataContainer.class);
                res.getDataobject().forEach(dataobject -> {
                    deputies.add(new Deputy(dataobject.getId(), dataobject.getData().getName()));
                });
            }
            Sejm sejm = new Sejm(deputies);
            System.out.println(sejm);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
//https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=8
//json = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), MyPojo.class);