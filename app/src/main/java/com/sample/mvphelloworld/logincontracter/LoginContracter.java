package com.sample.mvphelloworld.logincontracter;

public interface LoginContracter {
    /** Represents the View in MVP. */
    interface View {
        void showLoginSucessMessage(String message);
        void showLoginFailureMessage(String error);
        void setErrorMessage(String error);
        void usernameValidation(String unamevalidation);
        void passwordValidation(String passwordvalidation);
        void showUnAndPass(String un,String pass);

        String getUsername();
        String getPassword();
    }

    /** Represents the LoginPresenter in MVP. */
    interface Presenter {
        void loginCheck(String username,String passowrd);
        void saveUsername(String firstName);
        void savePassword(String firstName);
        String getUsername();
        String getPassword();

    }
}
