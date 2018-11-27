package com.example.master.lamor_multichannel.abcde;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class IOkHttpClient {

    private static final int TIMEOUT = 10;
    private static OkHttpClient mOkHttpClient;

    private IOkHttpClient() {

    }

    private static final class IOkHttpClientHolder {
        private static final IOkHttpClient INSTANCE = new IOkHttpClient();
    }

    public static IOkHttpClient getInstance() {
        return IOkHttpClientHolder.INSTANCE;
    }


    public OkHttpClient getOkHttpClient() {

        if (mOkHttpClient != null) {
            return mOkHttpClient;
        }

        IHttpCommonInterceptor iHttpCommonInterceptor = new IHttpCommonInterceptor.Builder()
                .addHeaderParams("paltform", "Android")
                .addHeaderParams("token", "123456789000")
                .addHeaderParams("userId", "e123456789000")
                .build();

        mOkHttpClient = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .addInterceptor(iHttpCommonInterceptor)
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build();

        return mOkHttpClient;
    }


}
