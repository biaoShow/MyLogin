package com.example.administrator.mylogin.activity;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.mylogin.presenter.BasePresenter;

/**
 * 这个类是用来模拟栈的模式来管理activity和销毁view的防止内存泄漏
 * Created by Administrator on 2017/3/28 0028.
 */

public abstract class BaseMvpActivity <V,T extends BasePresenter<V>> extends AppCompatActivity{
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        presenter.dettach();
        super.onDestroy();
    }

    public abstract  T initPresenter();
}
