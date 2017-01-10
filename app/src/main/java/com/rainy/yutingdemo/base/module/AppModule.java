package com.rainy.yutingdemo.base.module;

import android.app.Application;

import com.google.gson.Gson;
import com.rainy.yutingdemo.HuiApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/1/3.
 */
@Module
public class AppModule {


    public AppModule(HuiApplication application) {
        this.mApplication = application;
    }

    private Application mApplication;

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Gson provideGson(){return new Gson();}



}