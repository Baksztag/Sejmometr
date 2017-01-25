package utils;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class Departures {
    private String kraj;
    private int liczba_dni;
    private double koszt_suma;


    @Override
    public String toString() {
        return "Departures{" +
                "kraj='" + kraj + '\'' +
                ", liczba_dni=" + liczba_dni +
                ", koszt_suma=" + koszt_suma +
                '}';
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getLiczba_dni() {
        return liczba_dni;
    }

    public void setLiczba_dni(int liczba_dni) {
        this.liczba_dni = liczba_dni;
    }

    public double getKoszt_suma() {
        return koszt_suma;
    }

    public void setKoszt_suma(double koszt_suma) {
        this.koszt_suma = koszt_suma;
    }
}
