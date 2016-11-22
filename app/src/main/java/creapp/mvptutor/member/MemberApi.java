package creapp.mvptutor.member;

import org.json.JSONObject;

import creapp.mvptutor.global.Const;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by azlan on 11/8/16.
 */
public interface MemberApi {
    @FormUrlEncoded
    @POST("user/login")
    Call<MemberResponse> getMember(@Field(Const.CLIENT_ID) String clientId, @Field(Const.EMAIL) String email, @Field(Const.PASSWORD) String password);
}
