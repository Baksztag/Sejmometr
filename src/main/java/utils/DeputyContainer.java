package utils;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-25.
 */
public class DeputyContainer {
    private String id;
    private LayersBean layers;


    @Override
    public String toString() {
        return "DeputyContainer{" +
                "id='" + id + '\'' +
                ", layers=" + layers +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LayersBean getLayers() {
        return layers;
    }

    public void setLayers(LayersBean layers) {
        this.layers = layers;
    }
}
