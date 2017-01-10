package com.rainy.yutingdemo;

import android.app.Application;

import com.rainy.yutingdemo.base.AppComponent;
import com.rainy.yutingdemo.base.DaggerAppComponent;
import com.rainy.yutingdemo.base.module.ApiServiceModule;
import com.rainy.yutingdemo.base.module.AppModule;
import com.rainy.yutingdemo.base.module.DBModule;
import com.rainy.yutingdemo.base.module.HttpModule;

/**
 * Author: Rainy <br>
 * Description: YutingDemo <br>
 * Since: 2017/1/10 0010 下午 5:21 <br>
 */

public class HuiApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .dBModule(new DBModule())
                .httpModule(new HttpModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
