package com.rainy.yutingdemo.base.module;

import android.app.Application;


import com.rainy.yutingdemo.db.CommonDBHelper;
import com.rainy.yutingdemo.db.dao.UserInfoDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Laiyimin on 2017/1/4.
 */
@Module
public class DBModule {

    @Singleton
    @Provides
    CommonDBHelper provideCommonSQLiteHelper(Application application) {
        return new CommonDBHelper(application);
    }

    @Singleton
    @Provides
    UserInfoDao provideUserInfoDao(CommonDBHelper dbHelper) {
        return new UserInfoDao(dbHelper);
    }


}
