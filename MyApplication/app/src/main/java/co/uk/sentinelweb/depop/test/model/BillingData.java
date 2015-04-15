
package co.uk.sentinelweb.depop.test.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class was generated from JSON : http://www.jsonschema2pojo.org/
 */
public class BillingData {

    @Expose
    private String address;
    @SerializedName("birth_country")
    @Expose
    private String birthCountry;
    @Expose
    private String birthday;
    @Expose
    private String city;
    @Expose
    private String country;
    @SerializedName("is_valid")
    @Expose
    private Boolean isValid;
    @Expose
    private String name;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @Expose
    private String ssn;
    @Expose
    private String state;
    @Expose
    private String type;
    @SerializedName("vat_code")
    @Expose
    private String vatCode;

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The birthCountry
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * 
     * @param birthCountry
     *     The birth_country
     */
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    /**
     * 
     * @return
     *     The birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 
     * @param isValid
     *     The is_valid
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * 
     * @param ssn
     *     The ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The vatCode
     */
    public String getVatCode() {
        return vatCode;
    }

    /**
     * 
     * @param vatCode
     *     The vat_code
     */
    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

}
