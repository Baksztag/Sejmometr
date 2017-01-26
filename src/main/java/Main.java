import java.io.IOException;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ArgumentsParser parser = new ArgumentsParser(args);
            int termOfOffice = parser.getTermOfOffice();
            String deputyName = parser.getName();
            boolean download = parser.download();

            Sejm sejm;
            if (download) {
                sejm = new Sejm(new SejmBuilderFromAPI(termOfOffice));
                sejm.saveDeputiesToTxt();
            } else {
                sejm = new Sejm(new SejmBuilderFromTxt(termOfOffice));
            }
            if (!deputyName.isEmpty()) {
                System.out.println(deputyName + "'s expenses: "
                        + sejm.deputyExpenses(deputyName));
                System.out.println(deputyName + "'s minor fixes expenses: "
                        + sejm.deputyMinorFixesExpenses(deputyName));
            }

            System.out.println("Average deputy expenses: "
                    + sejm.averageExpenses());
            System.out.println("Deputy who made most trips abroad: "
                    + sejm.mostTravelsDeputy());
            System.out.println("Deputy who spent most days abroad: "
                    + sejm.mostDaysAbroadDeputy());
            System.out.println("Deputy who made most expensive trip: "
                    + sejm.mostExpensiveTravelDeputy());
            System.out.println("Deputies who visited Italy:");
            for (Deputy deputy : sejm.deputiesWhoVisitedItaly()) {
                System.out.println(deputy);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}