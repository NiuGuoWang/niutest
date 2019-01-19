package com.example.mypracticaltraining.api;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ImyApi {
//    area-to-id?area=%E4%B8%BD%E6%B1%9F
    String myurl=" http://saweather.market.alicloudapi.com/";
//    hour24?area=%E4%B8%BD%E6%B1%9F&areaid=101230506
//    Url: http://saweather.market.alicloudapi.com/
    int TYPE_ONE=1;
    int TYPE_TWO=2;

    @GET
    @Headers({"Authorization:APPCODE be7eabda20df4778b496a53758ae78bc"})
    Observable<ResponseBody>getObservable(@Url String url, @QueryMap Map<String,Object>map);
}
