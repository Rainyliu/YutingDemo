package com.rainy.yutingdemo.di.module;


import com.rainy.yutingdemo.base.scope.ActivityScope;
import com.rainy.yutingdemo.ui.login.LoginContract;
import com.rainy.yutingdemo.ui.login.LoginModel;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
    private LoginContract.View view;

    public LoginModule(LoginContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    LoginContract.View provideLoginView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    LoginContract.Model provideLoginModel(LoginModel model) {
        return model;
    }

}
