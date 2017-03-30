package com.example.administrator.mylogin.model;

import android.util.Log;

import com.example.administrator.mylogin.api.Api;
import com.example.administrator.mylogin.httpClientRetrofit.RetrofitClient;
import com.example.administrator.mylogin.server.IHttpInterface;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class LoginModelIpml extends BaseModel implements ILoginModel{

    public LoginModelIpml(boolean isCache) {
        super(isCache);
    }

    @Override
    public void login(String username, String password, final OnLoginListener onLoginListener) {
        /*HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
        IHttpInterface iHttpInterface = RetrofitClient.getRetrofit(okHttpClient);

        Observable<String> stringObservable =  iHttpInterface.postRxLogin(username,password);
        stringObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        Log.i("tags","这是onCompleted");
                        //Toast.makeText(MainActivity.this,"获取数据成功",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("tags","onError"+e.getMessage());
//                        etLoginSuccess.setVisibility(View.VISIBLE);
//                        etLoginSuccess.setText(e.getMessage());
                    }

                    @Override
                    public void onNext(String s) {
                        Log.i("tags","onNext"+s);
                        onLoginListener.loginHandle(s);
                    }
                });*/


        IHttpInterface iHttpInterface = retrofitManager.getService();
        Observable<String> stringObservable =  iHttpInterface.postRxLogin(username,password);
        stringObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted(){
                        Log.i("tags","这是onCompleted");
                        //Toast.makeText(MainActivity.this,"获取数据成功",Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onError(Throwable e) {
                        Log.i("tags","onError"+e.getMessage());
//                        etLoginSuccess.setVisibility(View.VISIBLE);
//                        etLoginSuccess.setText(e.getMessage());
                    }
                    @Override
                    public void onNext(String s) {
                        Log.i("tags","onNext"+s);
                        onLoginListener.loginHandle(s);
                    }
                });
    }
}
