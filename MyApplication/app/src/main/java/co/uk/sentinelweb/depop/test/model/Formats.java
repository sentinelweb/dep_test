
package co.uk.sentinelweb.depop.test.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class was generated from JSON : http://www.jsonschema2pojo.org/
 */
public class Formats {
    @SerializedName("U0")
    @Expose
    private PictureFormat U0;
    @SerializedName("P0")
    @Expose
    private PictureFormat P0;
    @SerializedName("P1")
    @Expose
    private PictureFormat P1;
    @Expose
    private PictureFormat P2;
    @Expose
    private PictureFormat P3;
    @Expose
    private PictureFormat P4;

    /**
     * 
     * @return
     *     The U0
     */
    public PictureFormat getU0() {
        return U0;
    }

    /**
     * 
     * @param U0
     *     The U0
     */
    public void setU0(PictureFormat U0) {
        this.U0 = U0;
    }

    public PictureFormat getP0() {
        return P0;
    }

    public void setP0(PictureFormat p0) {
        P0 = p0;
    }

    public PictureFormat getP1() {
        return P1;
    }

    public void setP1(PictureFormat p1) {
        P1 = p1;
    }

    public PictureFormat getP2() {
        return P2;
    }

    public void setP2(PictureFormat p2) {
        P2 = p2;
    }

    public PictureFormat getP3() {
        return P3;
    }

    public void setP3(PictureFormat p3) {
        P3 = p3;
    }

    public PictureFormat getP4() {
        return P4;
    }

    public void setP4(PictureFormat p4) {
        P4 = p4;
    }
}
