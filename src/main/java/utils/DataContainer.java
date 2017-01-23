package utils;

import java.util.List;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class DataContainer {
    private Links Links;
    private List<Dataobject> Dataobject;


    @Override
    public String toString() {
        return "DataContainer{" +
                "Links=" + Links +
                ", Dataobject=" + Dataobject +
                '}';
    }

    public Links getLinks() {
        return Links;
    }

    public void setLinks(Links links) {
        this.Links = links;
    }

    public List<Dataobject> getDataobject() {
        return Dataobject;
    }

    public void setDataobject(List<Dataobject> dataobject) {
        this.Dataobject = dataobject;
    }
}
