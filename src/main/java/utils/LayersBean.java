package utils;

import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class LayersBean {
    private List<Departures> wyjazdy;
    private Expenses wydatki;


    @Override
    public String toString() {
        return "LayersBean{" +
                "wyjazdy=" + wyjazdy +
                ", wydatki=" + wydatki +
                '}';
    }

    public List<Departures> getWyjazdy() {
        return wyjazdy;
    }

    public void setWyjazdy(List<Departures> wyjazdy) {
        this.wyjazdy = wyjazdy;
    }

    public Expenses getWydatki() {
        return wydatki;
    }

    public void setWydatki(Expenses wydatki) {
        this.wydatki = wydatki;
    }
}
