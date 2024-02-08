package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainSpinner extends Activity implements AdapterView.OnItemSelectedListener {
    private TextView textView;
    private Spinner spinner;
    private List<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_spinner);
        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        textView.setText("你选择的的城市是");
        //1设置数据源
        list = new ArrayList<String>();
        list.add("北京");
        list.add("上海");
        list.add("广州");
        list.add("深圳");

        //2新建数组适配器ArrayAdapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        //3设置下拉列表样式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //4spinner加载适配器
        spinner.setAdapter(adapter);
        //5spinner 设置监听器
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String cityName = adapter.getItem(position);
//        list.get(position);
        textView.setText("您选择的是"+cityName);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
