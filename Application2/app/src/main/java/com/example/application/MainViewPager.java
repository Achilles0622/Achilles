package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainViewPager extends AppCompatActivity {
    private List<View> viewList;
    private ViewPager pager;
    private PagerTabStrip tab ;
    private List<String>titleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainviewpager);
        viewList =new ArrayList<View>();
        //通过view对象作为viewpager的数据云啊
        View view1 = View.inflate(this, R.layout.activity_main_view_pager, null);
        View view2 = View.inflate(this, R.layout.activity_main_view2_pager, null);
        View view3 = View.inflate(this, R.layout.activity_main_view3_pager, null);
        View view4 = View.inflate(this, R.layout.activity_main_view4_pager, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);
        //为ViewPager页卡设置标题
        titleList =new ArrayList<String>();
        titleList.add("第1页");
        titleList.add("第2页");
        titleList.add("第3页");
        titleList.add("第4页");
        tab=findViewById(R.id.pager_tab_strip);
        tab.setBackgroundColor(Color.YELLOW);
        tab.setTextColor(Color.RED);
        tab.setTabIndicatorColor(Color.GREEN);
        //初始化ViewPager
        pager=findViewById(R.id.pager);
        //创建PagerAdapter的适配器
        MyPagerAdapter adapter=new MyPagerAdapter(viewList,titleList);
        pager.setAdapter(adapter);

    }
}