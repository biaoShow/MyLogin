package com.example.administrator.mylogin.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mylogin.R;
import com.example.administrator.mylogin.bean.beanUser;
import com.example.administrator.mylogin.presenter.LoginPresenter;
import com.example.administrator.mylogin.view.ILoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseMvpActivity<ILoginView, LoginPresenter> implements ILoginView {


    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    @BindView(R.id.lyLogin)
    LinearLayout lyLogin;
    @BindView(R.id.etLoginSuccess)
    TextView etLoginSuccess;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    //初始化presenter
    @Override
    public LoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void showData(String s) {
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();

    }
    @Override
    public void showLoading() {

    }
    @Override
    public void hideLoading() {

    }

    @Override
    public String getUsername() {
        return etUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @OnClick({R.id.btnLogin, R.id.btnRegister})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnLogin://登陆按钮
                presenter.login();
                break;
            case R.id.btnRegister://注册按钮
                break;
        }
    }
}
