package utils;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jakub.a.kret@gmail.com on 2017-01-23.
 */
public class Data {
    @SerializedName("ludzie.nazwa")
    private String ludzie_id;


    @Override
    public String toString() {
        return "Data{" +
                "ludzie_id='" + ludzie_id + '\'' +
                '}';
    }

    public String getLudzie_id() {
        return ludzie_id;
    }

    public void setLudzie_id(String ludzie_id) {
        this.ludzie_id = ludzie_id;
    }
}
