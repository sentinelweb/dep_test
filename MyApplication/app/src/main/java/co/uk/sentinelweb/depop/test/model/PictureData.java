
package co.uk.sentinelweb.depop.test.model;


import com.google.gson.annotations.Expose;
/**
 * This class was generated from JSON : http://www.jsonschema2pojo.org/
 */
public class PictureData {

    @Expose
    private Formats formats;
    @Expose
    private Integer id;

    /**
     * 
     * @return
     *     The formats
     */
    public Formats getFormats() {
        return formats;
    }

    /**
     * 
     * @param formats
     *     The formats
     */
    public void setFormats(Formats formats) {
        this.formats = formats;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
