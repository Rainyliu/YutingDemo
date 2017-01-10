package com.rainy.yutingdemo.manager;


import com.rainy.yutingdemo.network.retrofit.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceManager {

    private UserService mUserService;

    @Inject
    public ServiceManager(UserService userService) {
        this.mUserService = userService;
    }

    public UserService getUserService() {
        return mUserService;
    }

}
