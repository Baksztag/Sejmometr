import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import utils.DeputyContainer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Deputy {
    private int id;
    private String name;
    private int tripsAbroad;
    private int daysAbroad;
    private double mostExpensiveTrip;
    private boolean visitedItaly;


    public Deputy(int id, String name) throws IOException{
        this.id = id;
        this.name = name;

        String link = "https://api-v3.mojepanstwo.pl/dane/poslowie/" + id + ".json?layers[]=wyjazdy&layers[]=wydatki";
        URL url = new URL(link);
        Gson gson = new Gson();
        DeputyContainer res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DeputyContainer.class);

        int trips = 0;
        int days = 0;
        double mostExpensive = 0;
        boolean italy = false;
        for(utils.Departures departure : res.getLayers().getWyjazdy()) {
            if(!departure.getKraj().equals("Polska")) {
                trips++;
                days += departure.getLiczba_dni();
                if(departure.getKraj().equals("Włochy")) {
                    italy = true;
                }
            }

            if(departure.getKoszt_suma() > mostExpensive) {
                mostExpensive = departure.getKoszt_suma();
            }
        }
        this.tripsAbroad = trips;
        this.daysAbroad = days;
        this.mostExpensiveTrip = mostExpensive;
        this.visitedItaly = italy;

    }

    @Override
    public String toString() {
        return "Deputy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String toTxtFile() {
        if(name.isEmpty()) {
            return id + " " + "unknown";
        }
        return id + " " + name;
    }

    public int getTripsAbroad() {
        return tripsAbroad;
    }

    public int getDaysAbroad() {
        return daysAbroad;
    }

    public double getMostExpensiveTrip() {
        return mostExpensiveTrip;
    }

    public boolean visitedItaly() {
        return visitedItaly;
    }

    public String toTxt() {
        return id + ":"
                + name + ":"
                + tripsAbroad + ":"
                + daysAbroad + ":"
                + mostExpensiveTrip + ":"
                + visitedItaly;
    }
}
