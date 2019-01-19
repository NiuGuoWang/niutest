package com.example.mypracticaltraining.prenster;

import java.util.Map;

public interface Ipresenter {
    void getData(String url, Map<String , Object >map, int type);

    interface  Callback<T>{
        void success(T result);
        void fail(String tips);
    }
}
