package com.trainning.framgia.mvp.data;

public class User {
    private String mEmail,mPass;

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPass() {
        return mPass;
    }

    public void setPass(String pass) {
        mPass = pass;
    }

    public User(String email, String pass) {
        mEmail = email;
        mPass = pass;
    }
}
