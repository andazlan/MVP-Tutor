package creapp.mvptutor.login;

import android.util.Log;

import org.json.JSONObject;

import creapp.mvptutor.BuildConfig;
import creapp.mvptutor.global.NetUtil;
import creapp.mvptutor.member.MemberApi;
import creapp.mvptutor.member.MemberResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by azlan on 11/8/16.
 */
public class LoginPresenterImpl implements LoginPresenter {
    private LoginView mLoginView;
    private Retrofit mRetrofit;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView = loginView;
        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(NetUtil.getUrl())
                .build();
    }

    public boolean isEmptyString(String str){
        return str.isEmpty();
    }

    @Override
    public void login(String email, String password) {
        if (email == null || isEmptyString(email)){
            mLoginView.onEmailEmpty();
        }
        else if(password == null || isEmptyString(password)){
            mLoginView.onPasswordEmpty();
        }
        else{
            mLoginView.onShowProgress();
            doLogin(email, password);
        }
    }

    private void doLogin(String email, String password){
        MemberApi memberApi = mRetrofit.create(MemberApi.class);
        Call<MemberResponse> call = memberApi.getMember(BuildConfig.CLIENT_ID, email, password);
        call.enqueue(new Callback<MemberResponse>() {
            @Override
            public void onResponse(Call<MemberResponse> call, Response<MemberResponse> response) {
                if (response.body().isRequestSuccess()) {
                    Log.d("doLoginTest", "Member : " + response.body().getMember().getName());
                    mLoginView.onLoginSuccess();
                }
                else{
                    Log.d("doLoginTest", "Fail : " + response.body().getMeta().getMessage() + " code " + response.body().getMeta().getCode());
                    mLoginView.onLoginFailed(response.body().getMeta().getMessage());
                }
                mLoginView.onHideProgress();
            }

            @Override
            public void onFailure(Call<MemberResponse> call, Throwable t) {
                mLoginView.onLoginFailed(t.getMessage());
                mLoginView.onHideProgress();
            }
        });
    }
}
