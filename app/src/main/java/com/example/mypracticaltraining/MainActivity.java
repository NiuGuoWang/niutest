package com.example.mypracticaltraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String name;
    private String nameId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        CityFragment cityFragment = new CityFragment(vp);
        TianQiFragment tianQiFragment = new TianQiFragment();
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(cityFragment);
        fragments.add(tianQiFragment);
        VpAdapter vpAdapter = new VpAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(vpAdapter);
    }
}
