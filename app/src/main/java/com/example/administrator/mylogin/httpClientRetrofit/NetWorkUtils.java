package com.example.administrator.mylogin.httpClientRetrofit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class NetWorkUtils {
    /**
     * 获取当前网络类型
     *
     * @param context
     * @return -1 没有网络
     * 0 移动网络;
     * 1 wifi;
     * 2 其他；
     * @throws Exception
     */
    public static boolean getNetWorkType(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork == null){
            return false;
        }else {
            return true;
        }
    }
}
