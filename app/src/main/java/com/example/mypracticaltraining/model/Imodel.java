package com.example.mypracticaltraining.model;

import com.example.mypracticaltraining.prenster.Ipresenter;

import java.util.Map;

public interface Imodel {
    void getJieXi(String url, Map<String,Object>map, int type, Ipresenter.Callback callback);
}
