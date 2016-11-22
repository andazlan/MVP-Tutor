
package creapp.mvptutor.member;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import creapp.mvptutor.meta.Meta;

public class MemberResponse {
    @SerializedName("Meta")
    @Expose
    private Meta meta;
    @SerializedName("Data")
    @Expose
    private Member member;
    @SerializedName("AccessToken")
    @Expose
    private String accessToken;

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The Meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The member
     */
    public Member getMember() {
        return member;
    }

    /**
     * 
     * @param member
     *     The Member
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * 
     * @return
     *     The accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * @param accessToken
     *     The AccessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public boolean isRequestSuccess(){
        if (this.getMeta().getCode() != 200){
            return false;
        }
        return true;
    }
}
