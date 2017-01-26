import java.io.IOException;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Main {
    public static void main(String[] args) {
        try {



            SejmBuilder builder1 = new SejmBuilderFromTxt(7);
            SejmBuilder builder2 = new SejmBuilderFromTxt(8);
            Sejm sejm1 = new Sejm(builder1);
            Sejm sejm2 = new Sejm(builder2);

            System.out.println(sejm1.getDeputies());
            System.out.println(sejm1.deputyExpenses("Anna Grodzka"));
            System.out.println(sejm1.deputyMinorFixesExpenses("Tadeusz Iwiński"));
            System.out.println(sejm1.averageExpenses());
            System.out.println(sejm1.mostTravelsDeputy());
            System.out.println(sejm1.mostDaysAbroadDeputy());
            System.out.println(sejm1.mostExpensiveTravelDeputy());
            System.out.println(sejm1.deputiesWhoVisitedItaly().size());
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Make sure to initialize the file with -r option");
        }
    }
}