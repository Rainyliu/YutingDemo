package com.rainy.yutingdemo.di.component;


import com.rainy.yutingdemo.base.AppComponent;
import com.rainy.yutingdemo.base.scope.ActivityScope;
import com.rainy.yutingdemo.di.module.LoginModule;
import com.rainy.yutingdemo.ui.login.LoginActivity;

import dagger.Component;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity activity);

}
