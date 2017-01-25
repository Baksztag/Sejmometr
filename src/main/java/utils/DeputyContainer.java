package utils;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class DeputyContainer {
    private String id;
    private LayersBean layers;


//    public DeputyContainer() {
//        int trips = 0;
//        int days = 0;
//        double mostExpensive = 0;
//        boolean italy = false;
//
//        for(Departures departure : layers.getWyjazdy()) {
//            if(!departure.getKraj().equals("Polska")) {
//                trips++;
//                days += departure.getLiczba_dni();
//                if(departure.getKraj().equals("Włochy")) {
//                    italy = true;
//                }
//            }
//
//            if(departure.getKoszt_suma() > mostExpensive) {
//                mostExpensive = departure.getKoszt_suma();
//            }
//        }
//
//        this.tripsAbroad = trips;
//        this.daysAbroad = days;
//        this.mostExpensiveTrip = mostExpensive;
//        this.visittedItaly = italy;
//    }

    @Override
    public String toString() {
        return "DeputyContainer{" +
                "id='" + id + '\'' +
                ", layers=" + layers +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LayersBean getLayers() {
        return layers;
    }

    public void setLayers(LayersBean layers) {
        this.layers = layers;
    }
}
