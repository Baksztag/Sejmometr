/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public interface DeputyBuilder {
    int getId();

    String getName();

    int getTripsAbroad();

    int getDaysAbroad();

    double getMostExpensiveTrip();

    boolean getVisitedItaly();

    double getExpenses();

    double getMinorFixesExpenses();
}
