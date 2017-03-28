package com.example.administrator.mylogin.httpClientRetrofit;

import android.content.Context;
import android.util.Log;

import java.io.File;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 这个是缓存
 * Created by Administrator on 2017/3/28 0028.
 */

public class RetrofitCache {

    private OkHttpClient getCacheOkHttpClient(Context context) {
        final File baseDir = context.getCacheDir();
        final File cacheDir = new File(baseDir, "HttpResponseCache");
        Log.i("缓存路径", cacheDir.getAbsolutePath());
        Cache cache = new Cache(cacheDir, 10 * 1024 * 1024);   //缓存可用大小为10M

        /*Interceptor REWRITE_CACHE_CONTROL_INTERCEPTOR = chain -> {
            Request request = chain.request();
            if(NetWorkUtils.getNetWorkType(context)){//没有网络不缓存
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)//仅仅使用缓存
                        .build();
            }

            Response originalResponse = chain.proceed(request);
            if (NetWorkUtils.getNetWorkType(context)) {
                int maxAge = 60;                  //在线缓存一分钟
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader("Cache-Control")
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .build();

            } else {
                int maxStale = 60 * 60 * 24 * 4 * 7;     //离线缓存4周
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader("Cache-Control")
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .build();
            }
        };*/

     /*   return new OkHttpClient.Builder()
                .addNetworkInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR)
                .addInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR)
                .cache(cache)
                .build();
    }*/
        return null;
    }
}
