package creapp.mvptutor.login;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import creapp.mvptutor.R;

public class LoginActivity extends AppCompatActivity implements LoginView {
    @Bind(R.id.edt_email) TextInputEditText email;
    @Bind(R.id.edt_password) TextInputEditText password;
    @Bind(R.id.btn_login) Button login;

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
    }

    @Override
    public void onShowValidationError(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
    }
}
