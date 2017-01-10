package com.rainy.yutingdemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Author: Rainy <br>
 * Description: YutingDemo <br> 通用数据库
 * Since: 2017/1/10 0010 下午 5:30 <br>
 */

public class CommonDBHelper extends SQLiteOpenHelper {

    public CommonDBHelper(Context context) {
        this(context, DBConstants.CommonDB.COMMON_DB_NAME, null, DBConstants.CommonDB.COMMON_DB_VERSION);
    }

    private CommonDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConstants.CommonDB.getCreateUserInfoSql());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

