package com.sample.mvphelloworld.loginview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sample.mvphelloworld.R;
import com.sample.mvphelloworld.logincontracter.LoginContracter;
import com.sample.mvphelloworld.loginpresenter.LoginPresenter;

public class LoginMainActivity extends AppCompatActivity implements LoginContracter.View,View.OnClickListener {

    LoginContracter.Presenter presenter;
    EditText username,password;
    Button login;
    TextView cred_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
        presenter=new LoginPresenter(this);
        init();
    }

    private void init() {
        cred_display=(TextView)findViewById(R.id.cred_display);
        username=(EditText) findViewById(R.id.editText);
        password=(EditText) findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.b_login);
        login.setOnClickListener(this);

    }

    @Override
    public void showLoginSucessMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginFailureMessage(String error) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setErrorMessage(String error) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void usernameValidation(String unamevalidation) {
        username.setError(unamevalidation);
    }

    @Override
    public void passwordValidation(String passwordvalidation) {
        password.setError(passwordvalidation);
    }

    @Override
    public void showUnAndPass(String un, String pass) {
        cred_display.setText(un+" "+pass);
    }

    @Override
    public String getUsername() {
        return username.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return password.getText().toString().trim();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_login:
                presenter.saveUsername(username.getText().toString());
                presenter.savePassword(password.getText().toString());
                presenter.loginCheck(presenter.getUsername(),presenter.getPassword());
                break;
        }
    }
}
