package com.example.master.lamor_multichannel.abcde;

import android.util.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 拦截器
 * <p>
 * 同意添加消息头
 */

public class IHttpCommonInterceptor implements Interceptor {

    private Map<String, String> mHeaderParamsMap = new HashMap<>();

    public IHttpCommonInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Log.e("CHENGPAN", "IHttpCommonInterceptor 添加统一参数");
        Request oldRequest = chain.request();

        Request.Builder requestBuilder = oldRequest.newBuilder();
        requestBuilder.method(oldRequest.method(), oldRequest.body());
        if (mHeaderParamsMap.size() > 0) {
            for (Map.Entry<String, String> params : mHeaderParamsMap.entrySet()) {
                requestBuilder.addHeader(params.getKey(), params.getValue());
            }
        }
        Request newRequest = requestBuilder.build();
        return chain.proceed(newRequest);
    }

    public static class Builder {
        IHttpCommonInterceptor iHttpCommonInterceptor;

        public Builder() {
            iHttpCommonInterceptor = new IHttpCommonInterceptor();
        }

        public Builder addHeaderParams(String key, String value) {
            iHttpCommonInterceptor.mHeaderParamsMap.put(key, value);
            return this;
        }


        public Builder addHeaderParams(String key, int value) {
            return addHeaderParams(key, String.valueOf(value));
        }

        public Builder addHeaderParams(String key, float value) {
            return addHeaderParams(key, String.valueOf(value));
        }

        public Builder addHeaderParams(String key, long value) {
            return addHeaderParams(key, String.valueOf(value));
        }

        public Builder addHeaderParams(String key, double value) {
            return addHeaderParams(key, String.valueOf(value));
        }


        public IHttpCommonInterceptor build() {
            return iHttpCommonInterceptor;
        }


    }


}
