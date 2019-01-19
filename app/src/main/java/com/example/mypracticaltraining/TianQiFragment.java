package com.example.mypracticaltraining;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mypracticaltraining.bean.Weather_bean;
import com.example.mypracticaltraining.prenster.Ipresenter;
import com.example.mypracticaltraining.prenster.Prenster;
import com.example.mypracticaltraining.view.Iview;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class TianQiFragment extends Fragment implements Iview {
    private XRecyclerView xrv;
    private Ipresenter ipresenter;
    private String name;
    private String nameId;

    public TianQiFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tian_qi, container, false);
        initView(view);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            MainActivity activity = (MainActivity) getActivity();
            name = activity.getName();
            nameId = activity.getNameId();
            Log.e("tag",name+nameId);
            setData();
        }
    }

    private void initView(View view) {
        xrv = (XRecyclerView) view.findViewById(R.id.xrv);

    }

    public void setData(){
        this.ipresenter = new Prenster(this);
        Map<String,Object>map=new HashMap<>();
        map.put("appKey","714fbcaab5b7d1962eeb09fd40e87874");
        map.put("area",name);
        map.put("areaid",nameId);
        ipresenter.getData("hour24",map,2);
    }

    @Override
    public void getSuccess(Object resule) {
        Weather_bean weather_bean= (Weather_bean) resule;
        List<Weather_bean.ShowapiResBodyBean.HourListBean> list = weather_bean.getShowapi_res_body().getHourList();
        XrvAdapter xrvAdapter = new XrvAdapter(list, getContext());
        // 添加到Activity
         DividerItemDecoration divider = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
         divider.setDrawable(ContextCompat.getDrawable(getContext(),R.drawable.fengexian));
         xrv.addItemDecoration(divider);
         xrv.setLayoutManager(new LinearLayoutManager(getContext()));
         xrv.setAdapter(xrvAdapter);
         xrvAdapter.notifyDataSetChanged();
    }

    @Override
    public void getFail(String tips) {
        if (getContext()!=null){
            Toast.makeText(getContext(), tips, Toast.LENGTH_SHORT).show();
        }
    }
}
