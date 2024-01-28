package com.example.chapter05;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class DatePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private DatePicker dp_date;
    private TextView tv_date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        findViewById(R.id.btn_ok).setOnClickListener(this);
        dp_date = findViewById(R.id.dp_date);
        tv_date = findViewById(R.id.tv_date);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
//            case R.id.btn_ok:
//                String desc=String.format("选择的日期是%d年%d月%d日",dp_date.getYear(),dp_date.getMonth(),dp_date.getDayOfMonth());
//                break;
        }

    }
}