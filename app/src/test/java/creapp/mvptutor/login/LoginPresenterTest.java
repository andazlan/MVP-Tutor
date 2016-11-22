package creapp.mvptutor.login;


import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import creapp.mvptutor.BuildConfig;
import creapp.mvptutor.global.NetUtil;
import creapp.mvptutor.member.MemberApi;
import creapp.mvptutor.member.MemberResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.mockito.Mockito.*;

/**
 * Created by azlan on 11/8/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    private LoginPresenter loginPresenter;
    private Retrofit retrofit;

    @Mock
    LoginView loginView;

    @Before
    public void setUp() throws Exception {
        loginPresenter = new LoginPresenterImpl(loginView);
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(NetUtil.getUrl())
                .build();
    }

    @Test
    public void shouldShowErrorWhenEmailNull(){
        loginPresenter.login(null, "");
        verify(loginView).onEmailEmpty();
    }

    @Test
    public void shouldShowErrorWhenEmailEmpty(){
        loginPresenter.login("", "");
        verify(loginView).onEmailEmpty();
    }

    @Test
    public void shouldShowErrorWhenPasswordNull(){
        loginPresenter.login("and_azlan@yahoo.com", null);
        verify(loginView).onPasswordEmpty();
    }

    @Test
    public void shouldShowErrorWhenPasswordEmpty(){
        loginPresenter.login("and_azlan@yahoo.com", "");
        verify(loginView).onPasswordEmpty();
    }

    @Test
    public void shouldShowProgressWhenLogin() throws Exception {
        loginPresenter.login("and_azlan@yahoo.com", "dsasdada");
        verify(loginView).onShowProgress();
        //verify(loginView).onLoginFailed("Login failed");
    }
}