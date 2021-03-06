package com.rainy.yutingdemo.base.mvp;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by jess on 16/4/28.
 */
public class BasePresenter<M extends IModel, V extends BaseView> implements IPresenter {
    protected final String TAG = this.getClass().getSimpleName();

    @Inject
    protected M mModel;
    @Inject
    protected V mView;



    public BasePresenter() {
    }

    protected Context getContext(){
        return (Context) mView;
    }


}
