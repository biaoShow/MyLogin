package com.example.administrator.mylogin.presenter;

import com.example.administrator.mylogin.model.ILoginModel;
import com.example.administrator.mylogin.model.LoginModelIpml;
import com.example.administrator.mylogin.view.ILoginView;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class LoginPresenter extends BasePresenter<ILoginView> {
    private ILoginModel iLoginModel = new LoginModelIpml(false);
    private ILoginView iLoginView;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }
    public void login(){
        if (iLoginModel != null){
            iLoginModel.login(iLoginView.getUsername(), iLoginView.getPassword(), new ILoginModel.OnLoginListener() {
                @Override
                public void loginHandle(String s) {
                    iLoginView.showData(s);
                }
            });
        }

    }
}
