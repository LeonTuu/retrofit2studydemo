package com.mieasy.retrofit2studydemo.net.common;

import retrofit2.Retrofit;

public class IdeaApi {
    public static <T> T getApiService(Class<T> cls, String baseUrl) {
        Retrofit retrofit = RetrofitUtils.getRetrofitBuilder(baseUrl).build();
        return retrofit.create(cls);
    }
}
