package com.example.mypracticaltraining;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mypracticaltraining.bean.Weather_bean;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

public class XrvAdapter extends XRecyclerView.Adapter<XRecyclerView.ViewHolder> {
    List<Weather_bean.ShowapiResBodyBean.HourListBean> list;
    Context context;

    public XrvAdapter(List<Weather_bean.ShowapiResBodyBean.HourListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public XRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.tqitem, viewGroup,false);
        ViewHolder holder = new ViewHolder(inflate);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull XRecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder holder= (ViewHolder) viewHolder;
        holder.ctname.setText(list.get(i).getArea());
        holder.fstv.setText(list.get(i).getWind_power());
        holder.fxtv.setText(list.get(i).getWind_direction());
        holder.time.setText(list.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView ctname;
        private final TextView fxtv;
        private final TextView fstv;
        private final TextView tqtv;
        private final TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ctname = itemView.findViewById(R.id.cityname);
            fxtv = itemView.findViewById(R.id.fxtv);
            fstv = itemView.findViewById(R.id.fstv);
            tqtv = itemView.findViewById(R.id.tqtv);
            time = itemView.findViewById(R.id.timetv);
        }
    }
}
