package utils;

import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class Expenses {
    private int liczba_pol;
    private int liczba_rocznikow;
    private List<PunktyBean> punkty;
    private List<RocznikiBean> roczniki;


    public int getLiczba_pol() {
        return liczba_pol;
    }

    public void setLiczba_pol(int liczba_pol) {
        this.liczba_pol = liczba_pol;
    }

    public int getLiczba_rocznikow() {
        return liczba_rocznikow;
    }

    public void setLiczba_rocznikow(int liczba_rocznikow) {
        this.liczba_rocznikow = liczba_rocznikow;
    }

    public List<PunktyBean> getPunkty() {
        return punkty;
    }

    public void setPunkty(List<PunktyBean> punkty) {
        this.punkty = punkty;
    }

    public List<RocznikiBean> getRoczniki() {
        return roczniki;
    }

    public void setRoczniki(List<RocznikiBean> roczniki) {
        this.roczniki = roczniki;
    }

    public static class PunktyBean {
        private String tytul;
        private String numer;

        public String getTytul() {
            return tytul;
        }

        public void setTytul(String tytul) {
            this.tytul = tytul;
        }

        public String getNumer() {
            return numer;
        }

        public void setNumer(String numer) {
            this.numer = numer;
        }
    }

    public static class RocznikiBean {
        private String rok;
        private List<String> pola;


        public String getRok() {
            return rok;
        }

        public void setRok(String rok) {
            this.rok = rok;
        }

        public List<String> getPola() {
            return pola;
        }

        public void setPola(List<String> pola) {
            this.pola = pola;
        }
    }
}
