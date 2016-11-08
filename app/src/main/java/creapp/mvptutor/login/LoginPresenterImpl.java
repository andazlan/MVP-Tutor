package creapp.mvptutor.login;

/**
 * Created by azlan on 11/8/16.
 */
public class LoginPresenterImpl implements LoginPresenter {
    private LoginView mLoginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView = loginView;
    }

    public boolean isEmptyString(String str){
        return str.isEmpty();
    }

    @Override
    public void login(String email, String password) {
        if (isEmptyString(email)){
            mLoginView.onShowValidationError("Email empty");
        }
        else if(isEmptyString(password)){
            mLoginView.onShowValidationError("Password empty");
        }
        else{
            if (email.equals("andrew") && password.equals("android")){
                mLoginView.onLoginSuccess();
            }
            else {
                mLoginView.onLoginFailed();
            }
        }
    }
}
