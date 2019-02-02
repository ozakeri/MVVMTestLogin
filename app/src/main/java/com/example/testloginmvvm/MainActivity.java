package com.example.testloginmvvm;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testloginmvvm.Interface.LoginResultCallBack;
import com.example.testloginmvvm.databinding.ActivityMainBinding;
import com.example.testloginmvvm.viewmodel.LoginViewModel;
import com.example.testloginmvvm.viewmodel.LoginViewModelFactory;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setLogin(ViewModelProviders.of(this,
                new LoginViewModelFactory(this)).get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String success) {
        Toasty.success(this, "on success", Toasty.LENGTH_LONG).show();
    }

    @Override
    public void onError(String error) {
        Toasty.error(this, "on error", Toasty.LENGTH_LONG).show();
    }
}
