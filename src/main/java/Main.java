/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Main {
    public static void main(String[] args) {
        try {
            SejmBuilder builder = new SejmBuilderFromAPI(8);
//            SejmBuilder builder = new SejmBuilderFromTxt(8);
            Sejm sejm = new Sejm(builder);
            System.out.println(sejm.getDeputies().size());
            System.out.println(sejm);
            sejm.saveDeputiesToTxt();
            sejm = new Sejm(new SejmBuilderFromTxt(8));
            System.out.println(sejm.getDeputies().size());
            System.out.println(sejm);

//            SejmBuilder builder = new SejmBuilderFromTxt(8);
//            Sejm sejm = new Sejm(builder);
//            System.out.println(sejm);
//            sejm.saveDeputiesToTxt();
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
//https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]=8
//json = gson.fromJson(new JsonReader(new InputStreamReader(url.openStream())), MyPojo.class);