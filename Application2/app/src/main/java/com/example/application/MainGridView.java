package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainGridView extends Activity {
    private GridView gridView;
    private List<Map<String, Object>> dataList;
    private int[] icon = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,};
    private String[] iconName = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private SimpleAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_gridview);
        gridView = (GridView) findViewById(R.id.gridView);
        //1准备数据源
        //2新建适配器（SimpleAdapter)
        //3GridView加载适配器
        //4GridView配置事件监听器(OnItemClickListener)
        dataList = new ArrayList<Map<String, Object>>();
        //getData();
        adapter = new SimpleAdapter(this, getData(), R.layout.itemgrid, new String[]{"image", "text"}, new int[]{R.id.image, R.id.text});
        gridView.setAdapter(adapter);

    }

    private List<Map<String, Object>> getData() {
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text",iconName[i]);
            dataList.add(map);
        }
        return dataList;
    }
}
