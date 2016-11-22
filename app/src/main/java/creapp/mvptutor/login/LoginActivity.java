package creapp.mvptutor.login;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import creapp.mvptutor.R;

public class LoginActivity extends AppCompatActivity implements LoginView {
    @Bind(R.id.edt_email) TextInputEditText email;
    @Bind(R.id.edt_password) TextInputEditText password;
    @Bind(R.id.btn_login) Button login;
    @Bind(R.id.prb_progress) ProgressBar loading;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mPresenter = new LoginPresenterImpl(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(email.getText().toString().trim(), password.getText().toString());
            }
        });
        showProgress(false);
    }

    @Override
    public void onEmailEmpty() {
        //Toast.makeText(LoginActivity.this, "Email cannot empty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPasswordEmpty() {
        //Toast.makeText(LoginActivity.this, "Password cannot empty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginSuccess() {
        /*
        Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
        finish();
        */
    }

    @Override
    public void onLoginFailed(String message) {
        //Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShowProgress() {
        //showProgress(true);
    }

    @Override
    public void onHideProgress() {
        //showProgress(false);
    }

    private void showProgress(boolean isProgress) {
        if (isProgress){
            email.setEnabled(false);
            password.setEnabled(false);
            login.setVisibility(View.GONE);
            loading.setVisibility(View.VISIBLE);
        }
        else {
            email.setEnabled(true);
            password.setEnabled(true);
            login.setVisibility(View.VISIBLE);
            loading.setVisibility(View.GONE);
        }
    }
}
