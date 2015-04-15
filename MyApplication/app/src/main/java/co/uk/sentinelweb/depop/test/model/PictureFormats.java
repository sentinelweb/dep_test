package co.uk.sentinelweb.depop.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by robert on 14/04/2015.
 */
public class PictureFormats {
    @SerializedName("formats")
    @Expose
    Formats formats;

    public Formats getFormats() {
        return formats;
    }

    public void setFormats(Formats formats) {
        this.formats = formats;
    }
}
