import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import utils.DataContainer;
import utils.DeputyContainer;

import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Main {
    public static void main(String[] args) {
        try {

//            String link = "https://api-v3.mojepanstwo.pl/dane/poslowie/333.json?layers[]=wyjazdy&layers[]=wydatki";
            Deputy deputy = new Deputy(333, "Dorota Rutkowska");
            System.out.println(deputy);
            System.out.println(deputy.getTripsAbroad());
            System.out.println(deputy.getMostExpensiveTrip());
            System.out.println(deputy.getDaysAbroad());
            System.out.println(deputy.visitedItaly());
            System.out.println(deputy.getExpenses());
            System.out.println(deputy.getMinorFixesExpenses());
            System.out.println(deputy.toTxt());

//            System.out.println(res.getDaysAbroad());
//            System.out.println(res.getMostExpensiveTrip());
//            System.out.println(res.getTripsAbroad());
//            System.out.println(res.visittedItaly());

//            SejmBuilder builder = new SejmBuilderFromAPI(7);
//            SejmBuilder builder = new SejmBuilderFromTxt(8);
//            Sejm sejm = new Sejm(builder);
//            System.out.println(sejm.getDeputies().size());
//            System.out.println(sejm);
//            sejm.saveDeputiesToTxt();
//            sejm = new Sejm(new SejmBuilderFromTxt(8));
//            System.out.println(sejm.getDeputies().size());
//            System.out.println(sejm);

//            SejmBuilder builder = new SejmBuilderFromTxt(8);
//            Sejm sejm = new Sejm(builder);
//            System.out.println(sejm);
//            sejm.saveDeputiesToTxt();
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
//https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=8
//json = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), MyPojo.class);