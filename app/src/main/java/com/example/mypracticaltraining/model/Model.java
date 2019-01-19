package com.example.mypracticaltraining.model;

import com.example.mypracticaltraining.api.ImyApi;
import com.example.mypracticaltraining.bean.City_bean;
import com.example.mypracticaltraining.bean.Weather_bean;
import com.example.mypracticaltraining.prenster.Ipresenter;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Model implements Imodel {
    @Override
    public void getJieXi(String url, Map<String, Object> map, final int type, final Ipresenter.Callback callback) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ImyApi.myurl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final ImyApi imyApi = retrofit.create(ImyApi.class);
        Observable<ResponseBody> observable = imyApi.getObservable(url, map);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ResponseBody body) {
                        try {
                            String string = body.string();
                            if (type==ImyApi.TYPE_ONE){
                                City_bean city_bean = new Gson().fromJson(string, City_bean.class);
                                if (city_bean.getShowapi_res_code()==0){
                                    callback.success(city_bean);
                                }else {
                                    callback.fail("地点请求失败");
                                }
                            }
                            if (type==ImyApi.TYPE_TWO){
                                Weather_bean weather_bean = new Gson().fromJson(string, Weather_bean.class);
                                if (weather_bean.getShowapi_res_code()==0){
                                    callback.success(weather_bean);
                                }else {
                                    callback.fail("天气请求失败");
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.fail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
