import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class DataContainer {
    private Links links;
    private List<DataObject> dataObjects;


    @Override
    public String toString() {
        return "DataContainer{" +
                "links=" + links +
                ", dataObjects=" + dataObjects +
                '}';
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<DataObject> getDataObjects() {
        return dataObjects;
    }

    public void setDataObjects(List<DataObject> dataObjects) {
        this.dataObjects = dataObjects;
    }
}
