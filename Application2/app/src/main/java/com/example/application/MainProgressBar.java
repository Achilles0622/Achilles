package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainProgressBar extends Activity implements View.OnClickListener {
    private ProgressBar progress;
    private Button add;
    private Button reduce;
    private Button reset;
    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_PROGRESS);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_progressbar);
        //显示进度条
        setProgressBarVisibility(true);
        setProgressBarIndeterminateVisibility(false);
        setProgress(9999);
        init();
    }

    private void init() {
        progress = findViewById(R.id.horiz);
        add = findViewById(R.id.add);
        reduce = findViewById(R.id.reduce);
        reset = findViewById(R.id.reset);
        text = findViewById(R.id.textProgressBar);
        int first = progress.getProgress();
        int second = progress.getSecondaryProgress();
        int max = progress.getMax();
        text.setText("第一进度百分比"+(int)(first/(float)max*100)+"% 第二段进度百分比"+(int)(second/(float)max*100)+"%");
        add.setOnClickListener(this);
        reduce.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.add) {
            progress.incrementProgressBy(10);
            progress.incrementSecondaryProgressBy(10);


            // 处理添加按钮点击事件
        } else if (viewId == R.id.reduce) {
            progress.incrementProgressBy(-10);
            progress.incrementSecondaryProgressBy(-10);
            // 处理减少按钮点击事件
        } else if (viewId == R.id.reset) {
            progress.setProgress(50);
            progress.setSecondaryProgress(80);
            // 处理重置按钮点击事件
        }
    }

}
