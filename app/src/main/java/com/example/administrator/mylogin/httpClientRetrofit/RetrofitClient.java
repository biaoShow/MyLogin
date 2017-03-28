package com.example.administrator.mylogin.httpClientRetrofit;

import com.example.administrator.mylogin.api.Api;
import com.example.administrator.mylogin.server.IHttpInterface;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.subscriptions.CompositeSubscription;

/**
 * 这个类是自己封装好的请求client，通过okhttpclient
 * Created by Administrator on 2017/3/28 0028.
 * 单例模式
 */

public class RetrofitClient {
    private static IHttpInterface singleton;

    public static IHttpInterface getRetrofit(OkHttpClient client) {
        if (singleton == null) {
            synchronized (RetrofitClient.class) {
                singleton = createRetrofit(client).create(IHttpInterface.class);
            }
        }
        return singleton;
    }


    private static Retrofit createRetrofit(OkHttpClient client) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BaseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }








}
