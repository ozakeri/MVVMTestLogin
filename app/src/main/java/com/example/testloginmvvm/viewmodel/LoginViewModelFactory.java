package com.example.testloginmvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import android.view.ViewAnimationUtils;

import com.example.testloginmvvm.Interface.LoginResultCallBack;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    LoginResultCallBack loginResultCallBack;

    public LoginViewModelFactory(LoginResultCallBack loginResultCallBack) {
        this.loginResultCallBack = loginResultCallBack;
    }


    // Ctrl + o
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginResultCallBack);
    }
}
