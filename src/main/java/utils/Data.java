package utils;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Data {
    @SerializedName("ludzie.nazwa")
    private String name;


    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
