package com.mieasy.retrofit2studydemo.net.common;



import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;


public interface CommonService {
    @Streaming
    @GET//("download.do")
    Observable<ResponseBody> download(@Url String url);//直接使用网址下载
}
