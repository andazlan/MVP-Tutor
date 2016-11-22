
package creapp.mvptutor.photo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("ID")
    @Expose
    private int iD;
    @SerializedName("Original")
    @Expose
    private String original;
    @SerializedName("Small")
    @Expose
    private String small;
    @SerializedName("Medium")
    @Expose
    private String medium;

    /**
     * 
     * @return
     *     The iD
     */
    public int getID() {
        return iD;
    }

    /**
     * 
     * @param iD
     *     The ID
     */
    public void setID(int iD) {
        this.iD = iD;
    }

    /**
     * 
     * @return
     *     The original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * 
     * @param original
     *     The Original
     */
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * 
     * @return
     *     The small
     */
    public String getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The Small
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The Medium
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }

}
