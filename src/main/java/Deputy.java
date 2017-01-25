/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Deputy {
    private int id;
    private String name;


    public Deputy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String toTxtFile() {
        if(name.isEmpty()) {
            return id + " " + "unknown";
        }
        return id + " " + name;
    }
}
