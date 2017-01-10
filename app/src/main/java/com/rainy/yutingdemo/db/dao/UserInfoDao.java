package com.rainy.yutingdemo.db.dao;

import android.database.sqlite.SQLiteDatabase;

import com.rainy.yutingdemo.db.CommonDBHelper;


/**
 * Created by Ouyang on 2015/12/5.<br/>
 * Description：用户信息dao
 */
public class UserInfoDao {

    private static final String TAG = UserInfoDao.class.getSimpleName();

    private SQLiteDatabase database;


    public UserInfoDao(CommonDBHelper dbHelper) {
        database = dbHelper.getWritableDatabase();
    }

}
