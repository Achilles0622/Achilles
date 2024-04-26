package com.example.fragmentbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import com.example.fragmentbase.placeholder.OrderBReceiver;

public class BroadStandardActivity extends AppCompatActivity implements View.OnClickListener{

    private StandardReceiver standardReceiver;
    private OrderBReceiver orderBReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_standard);
        findViewById(R.id.btn_send_standard).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //发送广播
        Intent intent = new Intent(StandardReceiver.STANDARD_ACTION);
        sendBroadcast(intent,null);//null是接受权为空
    }

    @Override
    protected void onStart() {
        super.onStart();
        //将接受器给实例化对象
        standardReceiver = new StandardReceiver();
        //制作一个过滤器，过滤器只接受StandardReceiver的STANDARD_ACTION参数
        IntentFilter filter = new IntentFilter(StandardReceiver.STANDARD_ACTION);
        //这个是广播优先级，过滤器后面加上setPriority 优先级越大 越优先接受 如果没有优先级按顺序接受广播
        filter.setPriority(8);
        //注册接受器 第一个参数为接受器对象，第二个为过滤器对象
        registerReceiver(standardReceiver,filter);

        orderBReceiver = new OrderBReceiver();
        IntentFilter filterB = new IntentFilter(StandardReceiver.STANDARD_ACTION);
        filterB.setPriority(9);
        //这个是广播优先级，过滤器后面加上setPriority
        registerReceiver(orderBReceiver,filterB);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //注销接受器的参数为 实例化接受器的参数 注销后就不会接受广播了
        unregisterReceiver(standardReceiver);
        unregisterReceiver(orderBReceiver);

    }
}