package com.example.mypracticaltraining.prenster;

import com.example.mypracticaltraining.model.Imodel;
import com.example.mypracticaltraining.model.Model;
import com.example.mypracticaltraining.view.Iview;

import java.util.Map;

public class Prenster implements Ipresenter,Ipresenter.Callback {
    private Imodel imodel;
    private Iview iview;

    public Prenster(Iview iview) {
        this.iview = iview;
        this.imodel=new Model();
    }

    @Override
    public void getData(String url, Map<String, Object> map, int type) {
        imodel.getJieXi(url,map,type,this);
    }

    @Override
    public void success(Object result) {
        iview.getSuccess(result);
    }

    @Override
    public void fail(String tips) {
        iview.getFail(tips);
    }
}
