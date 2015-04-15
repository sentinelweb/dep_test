package co.uk.sentinelweb.depop.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robert on 14/04/2015.
 */
public class Products {
    @SerializedName("objects")
    @Expose
    List<Product> objects;

    public List<Product> getObjects() {
        return objects;
    }

    public void setObjects(List<Product> objects) {
        this.objects = objects;
    }
}
