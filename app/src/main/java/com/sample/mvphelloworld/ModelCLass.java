package com.sample.mvphelloworld;

public class ModelCLass {
    private String username;
    private String emailid;
    public   ModelCLass (){

    }
    public   ModelCLass (String username,String emailid){
        this.username=username;
        this.emailid=emailid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String password) {
        this.emailid = password;
    }




}
