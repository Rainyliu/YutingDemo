package com.rainy.yutingdemo.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rainy.yutingdemo.HuiApplication;
import com.rainy.yutingdemo.base.AppComponent;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected final String TAG = this.getClass().getSimpleName();
    protected HuiApplication mApplication;
    private Unbinder mUnbinder;
    @Inject
    protected P mPresenter;
    protected Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (HuiApplication) getApplication();
        mContext = this;

        setContentView(initView());
        mUnbinder = ButterKnife.bind(this);

        setupActivityComponent(mApplication.getAppComponent());
        initData();
    }

    /**
     * 依赖注入的入口
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != Unbinder.EMPTY) mUnbinder.unbind();
        this.mPresenter = null;
        this.mUnbinder = null;
        this.mApplication = null;
    }


    protected abstract View initView();

    protected abstract void initData();


}
