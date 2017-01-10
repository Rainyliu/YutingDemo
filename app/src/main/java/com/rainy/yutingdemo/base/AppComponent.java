package com.rainy.yutingdemo.base;

import android.app.Application;

import com.google.gson.Gson;
import com.rainy.yutingdemo.base.module.ApiServiceModule;
import com.rainy.yutingdemo.base.module.AppModule;
import com.rainy.yutingdemo.base.module.DBModule;
import com.rainy.yutingdemo.base.module.HttpModule;
import com.rainy.yutingdemo.manager.DBManager;
import com.rainy.yutingdemo.manager.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author: Rainy <br>
 * Description: YutingDemo <br>
 * Since: 2017/1/10 0010 下午 5:00 <br>
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class, DBModule.class})
public interface AppComponent {

    Application application();
    ServiceManager serviceManager();

    DBManager DBManager();

    Gson gson();
}
