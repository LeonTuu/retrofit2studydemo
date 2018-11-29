package com.mieasy.retrofit2studydemo.net;


import com.mieasy.retrofit2studydemo.BuildConfig;
import com.mieasy.retrofit2studydemo.net.common.IdeaApi;

public class RetrofitHelper {
    private static IdeaApiService mIdeaApiService;

    public static IdeaApiService  getApiService() {
        if (mIdeaApiService == null)
            mIdeaApiService = IdeaApi.getApiService(IdeaApiService.class,BuildConfig.DOMAIN);
        return mIdeaApiService;
    }
}
