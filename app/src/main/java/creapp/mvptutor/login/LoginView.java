package creapp.mvptutor.login;

/**
 * Created by azlan on 11/8/16.
 */
public interface LoginView {
    void onShowValidationError(String message);
    void onLoginSuccess();
    void onLoginFailed();
}
