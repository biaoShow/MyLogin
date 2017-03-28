package com.example.administrator.mylogin.model;

import com.example.administrator.mylogin.bean.User;
import com.example.administrator.mylogin.bean.beanUser;

/**
 * 登陆的借口
 * Created by Administrator on 2017/3/28 0028.
 */

public interface ILoginModel {

    void login(String username,String password,OnLoginListener onLoginListener);

    interface OnLoginListener{
        //加载数据成功后的回调方法
        void loginHandle(String s);
    }
}
