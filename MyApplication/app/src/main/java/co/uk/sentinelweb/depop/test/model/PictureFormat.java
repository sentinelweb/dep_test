
package co.uk.sentinelweb.depop.test.model;

import com.google.gson.annotations.Expose;
/**
 * This class was generated from JSON : http://www.jsonschema2pojo.org/
 */
public class PictureFormat {

    @Expose
    private Integer height;
    @Expose
    private String url;
    @Expose
    private Integer width;

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

}
