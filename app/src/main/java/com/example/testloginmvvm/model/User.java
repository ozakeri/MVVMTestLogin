package com.example.testloginmvvm.model;

import android.databinding.BaseObservable;
import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class User extends BaseObservable {

    private String email;
    private String password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length() > 6;
    }
}
