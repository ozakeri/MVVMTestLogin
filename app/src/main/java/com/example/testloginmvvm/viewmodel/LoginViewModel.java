package com.example.testloginmvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.testloginmvvm.Interface.LoginResultCallBack;
import com.example.testloginmvvm.model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallBack loginResultCallBack;

    public LoginViewModel(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;
        this.user = new User();
    }

    // write method to get email from editText and set to user
    public TextWatcher getEmailEditText() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    // write method to get password from editText and set to user
    public TextWatcher getPasswordEditText() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void afterEmailTextChange(CharSequence charSequence) {
        user.setEmail(charSequence.toString());
    }

    public void afterPasswordTextChange(CharSequence charSequence) {
        user.setPassword(charSequence.toString());
    }

    //write method for login button
    public void loginOnClock() {
        if (user.isValid()) {
            loginResultCallBack.onSuccess("success");
        } else {
            loginResultCallBack.onError("error");
        }
    }
}
