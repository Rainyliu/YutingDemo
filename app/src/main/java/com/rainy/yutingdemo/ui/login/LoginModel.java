package com.rainy.yutingdemo.ui.login;


import com.rainy.yutingdemo.base.mvp.BaseModel;
import com.rainy.yutingdemo.base.scope.ActivityScope;
import com.rainy.yutingdemo.manager.DBManager;
import com.rainy.yutingdemo.manager.ServiceManager;

import javax.inject.Inject;

import rx.Observable;

@ActivityScope
public class LoginModel extends BaseModel implements LoginContract.Model {

    @Inject
    ServiceManager mServiceManager;
    @Inject
    DBManager mDBManager;

    @Inject
    public LoginModel() {

    }


    @Override
    public Observable<String> login(String mobile, String password) {
//        JsonObject param = new JsonObject();
//        param.addProperty("username",mobile);
//        param.addProperty("password",password);
//        mServiceManager.getUserService().login(param);

        //这里模拟登录成功
        return Observable.just("登陆成功");
    }
}
