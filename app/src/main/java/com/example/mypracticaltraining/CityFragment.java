package com.example.mypracticaltraining;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mypracticaltraining.bean.City_bean;
import com.example.mypracticaltraining.prenster.Ipresenter;
import com.example.mypracticaltraining.prenster.Prenster;
import com.example.mypracticaltraining.view.Iview;

import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class CityFragment extends Fragment implements View.OnClickListener , Iview {

    private Button cha;
    FragmentTransaction transaction;
    ViewPager vp;
    private EditText et;
    private ListView lv;
    private Ipresenter ipresenter;
    private String etstr;

    public CityFragment(ViewPager vp) {
        this.vp = vp;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        cha = (Button) view.findViewById(R.id.cha);
        cha.setOnClickListener(this);
        et = (EditText) view.findViewById(R.id.et);
        et.setOnClickListener(this);
        lv = (ListView) view.findViewById(R.id.lv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cha:
                etstr = et.getText().toString();
                String REGEX_CHINESE = "^[\u4e00-\u9fa5]{1,9}$";
                if (etstr.matches(REGEX_CHINESE)){
                    Toast.makeText(getContext(), "验证成功", Toast.LENGTH_SHORT).show();
                    getData();
                }else {
                    Toast.makeText(getContext(), "请输入正确的汉字地名", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
    public void getData(){
        this.ipresenter = new Prenster(this);
        HashMap<String, Object> map = new HashMap<>();
        map.put("appKey","714fbcaab5b7d1962eeb09fd40e87874");
        map.put("area",etstr);
        ipresenter.getData("area-to-id",map,1);
}
    @Override
    public void getSuccess(Object resule) {
        City_bean city_bean= (City_bean) resule;
        final List<City_bean.ShowapiResBodyBean.ListBean> list = city_bean.getShowapi_res_body().getList();
        ListViewAdapter adapter = new ListViewAdapter(list, getContext());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainActivity activity = (MainActivity) getActivity();
                activity.setName(list.get(position).getArea());
                activity.setNameId(list.get(position).getAreaid());
                vp.setCurrentItem(1);
            }
        });
    }

    @Override
    public void getFail(String tips) {
        Log.e("tag",tips);
    }
}
