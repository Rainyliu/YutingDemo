package com.rainy.yutingdemo.db.dao;

import android.database.sqlite.SQLiteDatabase;

import com.rainy.yutingdemo.db.PrivateDBHelper;


public class ContactDao {

    private static final String TAG = ContactDao.class.getSimpleName();

    private SQLiteDatabase database;

    /**
     * 构造器
     *
     * @param helper
     */
    public ContactDao(PrivateDBHelper helper) {
        database = helper.getWritableDatabase();
    }

   }
