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
            System.out.println(sejm1.deputyExpenses("Tadeusz Iwiński"));
            System.out.println(sejm1.deputyMinorFixesExpenses("Tadeusz Iwiński"));
            System.out.println(sejm1.averageExpenses());
            System.out.println(sejm1.mostTravelsDeputy());
            System.out.println(sejm1.mostDaysAbroadDeputy());
            System.out.println(sejm1.mostExpensiveTravelDeputy());
            System.out.println(sejm1.deputiesWhoVisitedItaly().size());
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}