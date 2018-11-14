package com.sample.mvphelloworld.loginmodel;

public class LoginModel {

    public LoginModel(){

    }
    public String saveCredientails(String username,String passowrd){
        this.username=username;
        this.password=passowrd;
        return this.username+" "+this.password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

}
