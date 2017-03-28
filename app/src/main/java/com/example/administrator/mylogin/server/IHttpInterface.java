package com.example.administrator.mylogin.server;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/27 0027.
 */

public interface IHttpInterface {
    @FormUrlEncoded
    @POST("login/post")
    Call<String> postLogin(@Field("username") String username,
                           @Field("password") String password);

    @FormUrlEncoded//http://192.168.1.26/index/login/post
    @POST("login/post")
    Observable<String> postRxLogin(@Field("username") String username,
                                   @Field("password") String password);

}
