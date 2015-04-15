package co.uk.sentinelweb.depop.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Product data POJO
 * Created by robert on 14/04/2015.
 */
public class Product {

    @SerializedName("pictures_data")
    @Expose
    List<PictureFormats> picturesData;

    @SerializedName("price_amount")
    @Expose
    String priceAmount;

    @SerializedName("price_currency")
    @Expose
    String priceCurrency;

    @SerializedName("description")
    @Expose
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PictureFormats> getPicturesData() {
        return picturesData;
    }

    public void setPicturesData(List<PictureFormats> picturesData) {
        this.picturesData = picturesData;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }
}
