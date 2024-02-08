package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainListView extends AppCompatActivity implements AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private ListView listView;
    private ArrayAdapter<String> arr_adapter;
    private SimpleAdapter simp_adapter;
    private List<Map<String, Object>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listView);
        //新建一个适配器ArrayAdapter
        String[] arr_data = {"123", "345", "678", "abc"};
        dataList = new ArrayList<Map<String, Object>>();
        arr_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr_data);
        simp_adapter = new SimpleAdapter(this, getData(), R.layout.item, new String[]{"pic", "text"}, new int[]{R.id.pic, R.id.text});
        listView.setAdapter(simp_adapter);
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);

    }

    private List<Map<String, Object>> getData() {
        for (int i = 0; i < 20; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pic", R.drawable.ic_launcher_background);
            map.put("text", "abc" + (i + 1));
            dataList.add(map);
        }
        return dataList;
    }

    @Override
    public void onScrollStateChanged(AbsListView absListView, int scrollState) {
        switch (scrollState) {
            case SCROLL_STATE_FLING:
                Log.i("Main", "操作视图中");
                Map<String,Object>map=new HashMap<String,Object>();
                map.put("pic",R.drawable.ic_launcher_background);
                map.put("text","增加项");
                dataList.add(map);
                simp_adapter.notifyDataSetChanged();
                break;
            case SCROLL_STATE_IDLE:
                Log.i("Main", "stop");
                break;
            case SCROLL_STATE_TOUCH_SCROLL:
                Log.i("Main", "惯性滑动");
                break;

        }
    }

    @Override
    public void onScroll(AbsListView absListView, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String text = listView.getItemAtPosition(position) + "";
        Toast.makeText(this, "position=" + position + "text=" + text, Toast.LENGTH_SHORT).show();
    }
}