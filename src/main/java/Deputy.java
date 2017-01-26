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

    @Override
    public String toString() {
        return "Deputy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
