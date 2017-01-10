package com.rainy.yutingdemo.ui.login;

import com.rainy.yutingdemo.base.mvp.BasePresenter;
import com.rainy.yutingdemo.base.scope.ActivityScope;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/3.
 */
@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View> {

    @Inject
    public LoginPresenter() {

    }

    /**
     * 登录
     *
     * @param mobile
     * @param password
     */
    public void login(final String mobile, final String password) {
        mModel.login(mobile, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String result) {
                        mView.loginSuccess(result);
                    }
                });

    }
}
