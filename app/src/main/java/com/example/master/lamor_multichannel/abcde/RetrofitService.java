package com.example.master.lamor_multichannel.abcde;

import com.example.master.lamor_multichannel.bean.AppBean;
import com.example.master.lamor_multichannel.bean.InitBean;
import com.example.master.lamor_multichannel.bean.MovieSubject;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("top250")
    Observable<MovieSubject> getTest(@Query("start") int start, @Query("count") int count);

    //=====================================================================
    @FormUrlEncoded
    @POST("api/member/init")
    Observable<HttpReseult<InitBean>> init(@FieldMap() Map<String, String> params);

    @FormUrlEncoded
    @POST("api/app/list")
    Observable<HttpReseult<AppBean>> getAppList(@FieldMap() Map<String, String> params);


}
