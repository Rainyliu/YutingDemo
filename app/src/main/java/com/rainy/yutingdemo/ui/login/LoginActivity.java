package com.rainy.yutingdemo.ui.login;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rainy.yutingdemo.R;
import com.rainy.yutingdemo.base.AppComponent;
import com.rainy.yutingdemo.base.mvp.BaseActivity;
import com.rainy.yutingdemo.di.component.DaggerLoginComponent;
import com.rainy.yutingdemo.di.module.LoginModule;

import butterknife.BindView;

import butterknife.OnClick;

/**
 * Created by Administrator on 2017/1/3.
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {

    @BindView(R.id.et_username)
    EditText et_username;
    @BindView(R.id.et_password)
    EditText et_password;


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerLoginComponent
                .builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected View initView() {
        return LayoutInflater.from(mContext).inflate(R.layout.activity_login, null, false);
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.btn_login)
    public void onClick(View v) {
        String username = et_username.getText().toString();
        String password = et_password.getText().toString();

        mPresenter.login(username,password);
    }


    @Override
    public void loginSuccess(String result) {
        Toast.makeText(mContext,result,Toast.LENGTH_SHORT).show();
    }
}
