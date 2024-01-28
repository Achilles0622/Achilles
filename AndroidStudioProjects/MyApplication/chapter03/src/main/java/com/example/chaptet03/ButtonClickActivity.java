package com.example.chaptet03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chaptet03.R;

public class ButtonClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
        TextView tv_result = findViewById(R.id.tv_result);
        Button btn_click_single = findViewById(R.id.btn_click_single);
        btn_click_single.setOnClickListener(new MyViewOnClickListener());
    }
    class MyViewOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

//            return false;
        }
    }
}