package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActReceiveActivity extends AppCompatActivity {

    private TextView tv_receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_receive);
        findViewById(R.id.tv_receive);
        tv_receive = findViewById(R.id.tv_receive);
Bundle bundle= getIntent().getExtras();
        String request_content = bundle.getString("request_content");
        String desc =String.format("请求消息",request_content);
        tv_receive.setText(desc);
    }
}