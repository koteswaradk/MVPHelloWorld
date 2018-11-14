package com.sample.mvphelloworld;

import android.view.View;

public class Presenter {
    private ModelCLass modelCLass;
    private View view;

    public Presenter(View view){
        this.modelCLass=new ModelCLass();
        this.view=view;
    }
    public void updateUsername(String username){
        modelCLass.setUsername(username);
        view.updateUserInfoTextView(username);
    }
    public void updateEMail(String email){
        modelCLass.setEmailid(email);
        view.updateUserEmailTextView(email);
    }
    public interface View{

        void updateUserInfoTextView(String info);
        void updateUserEmailTextView(String info);

        void showProgressBar();
        void hideProgressBar();

    }

}
