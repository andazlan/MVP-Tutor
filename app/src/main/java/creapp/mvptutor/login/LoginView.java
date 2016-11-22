package creapp.mvptutor.login;

/**
 * Created by azlan on 11/8/16.
 */
public interface LoginView {
    void onEmailEmpty();
    void onPasswordEmpty();
    void onLoginSuccess();
    void onLoginFailed(String message);
    void onShowProgress();
    void onHideProgress();
}
