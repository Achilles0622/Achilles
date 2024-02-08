package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainImageSwitcher extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar seekBar;
    private TextView tv1;
    private TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image_switcher);
        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        seekBar.setOnSeekBarChangeListener(this);
    }

    //数值改变
    @Override
    public void onProgressChanged(SeekBar seekBar, int Progress, boolean b) {
        tv1.setText("正在拖动");
        tv2.setText("当前数值" + Progress);
    }

    //开始拖动
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        tv1.setText("开始拖动");
    }

    //停止拖动
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        tv1.setText("停止拖动");
    }
}