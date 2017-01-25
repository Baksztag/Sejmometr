import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import utils.DeputyContainer;
import utils.Expenses;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

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
    private double expenses;
    private double minorFixesExpenses;


    public Deputy(DeputyBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.tripsAbroad = builder.getTripsAbroad();
        this.daysAbroad = builder.getDaysAbroad();
        this.mostExpensiveTrip = builder.getMostExpensiveTrip();
        this.visitedItaly = builder.getVisitedItaly();
        this.expenses = builder.getExpenses();
        this.minorFixesExpenses = builder.getMinorFixesExpenses();
    }

//    public Deputy(int id, String name) throws IOException{
//        this.id = id;
//        this.name = name;
//
//        String link = "https://api-v3.mojepanstwo.pl/dane/poslowie/" + id + ".json?layers[]=wyjazdy&layers[]=wydatki";
//        URL url = new URL(link);
//        Gson gson = new Gson();
//        try {
//            DeputyContainer res = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), DeputyContainer.class);
//            List<Expenses.PunktyBean> punkty = res.getLayers().getWydatki().getPunkty();
//            List<Expenses.RocznikiBean> roczniki = res.getLayers().getWydatki().getRoczniki();
//
//            this.expenses = getExpenses(roczniki);
//            this.minorFixesExpenses = getMinorFixesExpenses(roczniki, getMinorFixesIndex(punkty));
//
//            int trips = 0;
//            int days = 0;
//            double mostExpensive = 0;
//            boolean italy = false;
//            for(utils.Departures departure : res.getLayers().getWyjazdy()) {
//                if(!departure.getKraj().equals("Polska")) {
//                    trips++;
//                    days += departure.getLiczba_dni();
//                    if(departure.getKraj().equals("Włochy")) {
//                        italy = true;
//                    }
//                }
//
//                if(departure.getKoszt_suma() > mostExpensive) {
//                    mostExpensive = departure.getKoszt_suma();
//                }
//            }
//            this.tripsAbroad = trips;
//            this.daysAbroad = days;
//            this.mostExpensiveTrip = mostExpensive;
//            this.visitedItaly = italy;
//        } catch (JsonSyntaxException e) {
//            System.out.println(e);
//        }
//    }
//
//    private double getExpenses(List<Expenses.RocznikiBean> roczniki) {
//        double sumOfExpenses = 0;
//        for(Expenses.RocznikiBean rocznik : roczniki) {
//            for(String pole : rocznik.getPola()) {
//                sumOfExpenses += Double.parseDouble(pole);
//            }
//        }
//        return sumOfExpenses;
//    }
//
//    private int getMinorFixesIndex(List<Expenses.PunktyBean> punkty) {
//        int minorFixesIndex = 0;
//        for(int i = 0; i < punkty.size(); i++) {
//            if(punkty.get(i).getTytul().contains("Koszty drobnych napraw")) {
//                minorFixesIndex = i;
//            }
//        }
//        return minorFixesIndex;
//    }
//
//    private double getMinorFixesExpenses(List<Expenses.RocznikiBean> roczniki, int minorFixesIndex) {
//        double minorFixesExpenses = 0;
//        for(Expenses.RocznikiBean rocznik : roczniki) {
//            for(int i = 0; i < rocznik.getPola().size(); i++) {
//                minorFixesExpenses += Double.parseDouble(rocznik.getPola().get(minorFixesIndex));
//            }
//        }
//        return minorFixesExpenses;
//    }

    @Override
    public String toString() {
        return "Deputy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public double getExpenses() {
        return expenses;
    }

    public double getMinorFixesExpenses() {
        return minorFixesExpenses;
    }

    public String toTxt() {
        return id + ":"
                + name + ":"
                + expenses + ":"
                + minorFixesExpenses + ":"
                + tripsAbroad + ":"
                + daysAbroad + ":"
                + mostExpensiveTrip + ":"
                + visitedItaly;
    }
}
