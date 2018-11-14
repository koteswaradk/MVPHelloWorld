package com.sample.mvphelloworld.loginpresenter;

import com.sample.mvphelloworld.logincontracter.LoginContracter;
import com.sample.mvphelloworld.loginmodel.LoginModel;

public class LoginPresenter implements LoginContracter.Presenter {

    LoginModel loginModel;
    LoginContracter.View view;

    public LoginPresenter(LoginContracter.View view){
        loginModel=new LoginModel();
        this.view=view;
    }

    @Override
    public void loginCheck(String username, String passowrd) {
        try{
            if (view.getUsername().isEmpty()){
                view.usernameValidation("UN Not found");
            }
            if (view.getPassword().isEmpty()){
                view.passwordValidation("Pass Not Fund");
            }
            if ((view.getUsername().isEmpty())&&(view.getPassword().isEmpty())){
                view.setErrorMessage("No Credentails Found");
                // return;
            }
            else if (view.getUsername().equalsIgnoreCase("koti")&&view.getPassword().equalsIgnoreCase("123")){
                view.showLoginSucessMessage("Login Success");
                view.showUnAndPass(loginModel.getUsername(),loginModel.getPassword());
            }
            else {
                view.showLoginFailureMessage("wrong credentials ");
            }
        }catch (Exception e){

        }


    }

    @Override
    public void saveUsername(String username) {
        loginModel.setUsername(username);
    }

    @Override
    public void savePassword(String password) {
        loginModel.setPassword(password);
    }

    @Override
    public String getUsername() {
        return loginModel.getUsername();
    }

    @Override
    public String getPassword() {
        return loginModel.getPassword();
    }
}
