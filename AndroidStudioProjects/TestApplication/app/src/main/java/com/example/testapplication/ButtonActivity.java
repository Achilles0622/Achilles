package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Button btn1 =findViewById(R.id.btn1);
        MyClickListener mcl=new MyClickListener();
        btn1.setOnClickListener(mcl);
    }
    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            //在控制台输出语句
            Log.e("TAG","刚刚点击按钮是注册内部类监听器对象的按钮");
        }
    }
}