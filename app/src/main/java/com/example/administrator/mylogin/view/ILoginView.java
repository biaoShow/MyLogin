package com.example.administrator.mylogin.view;


/**
 * Created by Administrator on 2017/3/27 0027.
 */

public interface ILoginView extends BaseView{

    //ui线程操作回调
    void showData(String s);

    void showLoading();

    void hideLoading();
    //获取控件的用户名
    String getUsername();
    //获取控件的密码
    String getPassword();

}
