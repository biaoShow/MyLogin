package com.example.administrator.mylogin.model;

import com.example.administrator.mylogin.httpClientRetrofit.RetrofitManager;

/**
 * Created by Administrator on 2017/3/30.
 */

public class BaseModel {

    public RetrofitManager retrofitManager;

    public BaseModel(boolean isCache){
        retrofitManager = retrofitManager.builder(isCache);
    }
}
