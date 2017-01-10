package com.rainy.yutingdemo.ui.login;

import com.rainy.yutingdemo.base.mvp.BaseView;
import com.rainy.yutingdemo.base.mvp.IModel;


import rx.Observable;

/**
 * Created by Administrator on 2017/1/3.
 */

public interface LoginContract {

    interface View extends BaseView {

        /**
         * 登录成功
         * @param result
         */
        void loginSuccess(String result);
    }

    interface Model extends IModel{

        /**
         * 登录
         * @param mobile
         * @param password
         */
        Observable<String> login(String mobile, String password);

    }
}
