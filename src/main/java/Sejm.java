import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Sejm {
    private List<Deputy> deputies;
    private int termOfOffice;


    public Sejm(SejmBuilder builder) throws IOException {
        this.deputies = builder.getDeputies();
        this.termOfOffice = builder.getTermOfOffice();
    }

    private Deputy getDeputyByName(String name) {
        for (Deputy deputy : deputies) {
            if (deputy.getName().equals(name)) {
                return deputy;
            }
        }
        return null;
    }

    public double deputyExpenses(String name) {
        Deputy deputy = getDeputyByName(name);
        if (deputy != null) {
            return deputy.getExpenses();
        }
        return 0.0;
    }

    public double deputyMinorFixesExpenses(String name) {
        Deputy deputy = getDeputyByName(name);
        if (deputy != null) {
            return deputy.getMinorFixesExpenses();
        }
        return 0.0;
    }

    public double averageExpenses() {
        double expenses = 0.0;
        for (Deputy deputy : deputies) {
            expenses += deputy.getExpenses();
        }
        return expenses / deputies.size();
    }

    public Deputy mostTravelsDeputy() {
        Deputy result = deputies.get(0);
        for (Deputy deputy : deputies) {
            if (deputy.getTripsAbroad() > result.getTripsAbroad()) {
                result = deputy;
            }
        }
        return result;
    }

    public Deputy mostDaysAbroadDeputy() {
        Deputy result = deputies.get(0);
        for (Deputy deputy : deputies) {
            if (deputy.getDaysAbroad() > result.getDaysAbroad()) {
                result = deputy;
            }
        }
        return result;
    }

    public Deputy mostExpensiveTravelDeputy() {
        Deputy result = deputies.get(0);
        for (Deputy deputy : deputies) {
            if (deputy.getMostExpensiveTrip() > result.getMostExpensiveTrip()) {
                result = deputy;
            }
        }
        return result;
    }

    public List<Deputy> deputiesWhoVisitedItaly() {
        List<Deputy> result = new LinkedList<>();
        for (Deputy deputy : deputies) {
            if (deputy.visitedItaly()) {
                result.add(deputy);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Sejm{" +
                "deputies=" + deputies +
                '}';
    }

    public void saveDeputiesToTxt() throws IOException {
        File file = new File("term" + this.termOfOffice + "deputies.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (Deputy deputy : deputies) {
            writer.write(deputy.toTxt());
            writer.newLine();
        }
        writer.close();
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public int getTermOfOffice() {
        return termOfOffice;
    }
}
