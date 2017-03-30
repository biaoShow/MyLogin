package com.example.administrator.mylogin.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/3/30.
 */

public class MyApplication extends Application {

    private static Context mAppllicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppllicationContext = this;
    }
    public static Context getContext(){
        return mAppllicationContext;
    }
}
