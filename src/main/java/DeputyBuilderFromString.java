/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class DeputyBuilderFromString implements DeputyBuilder {
    private int id;
    private String name;
    private int tripsAbroad;
    private int daysAbroad;
    private double mostExpensiveTrip;
    private boolean visitedItaly;
    private double expenses;
    private double minorFixesExpenses;


    public DeputyBuilderFromString(String input) {
        String[] split =  input.split(":");
        this.id = Integer.parseInt(split[0]);
        this.name = split[1];
        this.expenses = Double.parseDouble(split[2]);
        this.minorFixesExpenses = Double.parseDouble(split[3]);
        this.tripsAbroad = Integer.parseInt(split[4]);
        this.daysAbroad = Integer.parseInt(split[5]);
        this.mostExpensiveTrip = Double.parseDouble(split[6]);
        this.visitedItaly = Boolean.parseBoolean(split[7]);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTripsAbroad() {
        return tripsAbroad;
    }

    @Override
    public int getDaysAbroad() {
        return daysAbroad;
    }

    @Override
    public double getMostExpensiveTrip() {
        return mostExpensiveTrip;
    }

    public boolean getVisitedItaly() {
        return visitedItaly;
    }

    @Override
    public double getExpenses() {
        return expenses;
    }

    @Override
    public double getMinorFixesExpenses() {
        return minorFixesExpenses;
    }
}
