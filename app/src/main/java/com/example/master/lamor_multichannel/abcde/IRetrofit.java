package com.example.master.lamor_multichannel.abcde;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class IRetrofit {

//    private static final String URL = "https://api.douban.com/v2/movie/";
//    private static final String URL = "https://api.bbbearmall.com";
    private static final String URL = "http://api.abox.eratpay.com/";

    public static <T> T createApi(Class<T> cls) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(IOkHttpClient.getInstance().getOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit.create(cls);

    }

}
