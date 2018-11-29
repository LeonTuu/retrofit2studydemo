package com.mieasy.retrofit2studydemo.net;


import com.mieasy.retrofit2studydemo.module.MeiZi;
import com.mieasy.retrofit2studydemo.module.ReportListBean;

import java.util.List;

import dagger.Component;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IdeaApiService {

    /**
     *加载图片
    * */
    @Headers("Cache-Control: public, max-age=100")
    @GET("福利/10/4")
    Observable<List<MeiZi>> getMezi();
    /**
     *
     *获取司机的车牌
     * @author akf
     * */
    @Headers("Cache-Control: public, max-age=100")
    @POST("")
    Observable<List<ReportListBean>> getDriverNum(@Query("driver") String driver);
}
