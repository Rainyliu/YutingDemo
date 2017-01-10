package com.rainy.yutingdemo.manager;

import android.app.Application;


import com.rainy.yutingdemo.db.PrivateDBHelper;
import com.rainy.yutingdemo.db.dao.ContactDao;
import com.rainy.yutingdemo.db.dao.UserInfoDao;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DBManager {

    private Application application;

    private ContactDao contactDao;

    @Inject
    UserInfoDao mUserInfoDao;

    @Inject
    public DBManager(Application application) {
        this.application = application;
    }

    public UserInfoDao getUserInfoDao() {
        return mUserInfoDao;
    }

    public ContactDao getContactDao(Long userId) {
        if (contactDao == null) {
            synchronized (DBManager.class) {
                if (contactDao == null)
                    contactDao = new ContactDao(PrivateDBHelper.getInstance(application, userId));
            }
        }
        return contactDao;
    }
}
