package com.example.chaptet03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonLongClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_long_click);
      TextView tv_result=findViewById(R.id.tv_result);
        Button btn_click_single=findViewById(R.id.btn_long_click_single);
        btn_click_single.setOnClickListener((View.OnClickListener) v ->{

        });

    }
}