package com.example.mypracticaltraining;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mypracticaltraining.bean.City_bean;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    List<City_bean.ShowapiResBodyBean.ListBean> list;
    Context context;


    public ListViewAdapter(List<City_bean.ShowapiResBodyBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.ctitem,null);
        TextView xstv = convertView.findViewById(R.id.xstv);
        xstv.setText(list.get(position).getArea());
        return convertView;
    }
}
