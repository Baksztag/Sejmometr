/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class DataObject {
    private int id;
    private Data data;


    @Override
    public String toString() {
        return "DataObject{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
