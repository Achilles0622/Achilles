package com.example.chaptet03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        TextView tv_code_system = findViewById(R.id.tv_code_system);
        tv_code_system.setTextColor(Color.GREEN);
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        tv_code_system.setTextColor(0xff00ff00);
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        tv_code_system.setTextColor(0x00ff00);



    }
}