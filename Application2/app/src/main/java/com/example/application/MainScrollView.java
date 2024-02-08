package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainScrollView extends AppCompatActivity {
    private TextView tv;
    private ScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scroll_view);
        tv =findViewById(R.id.content);
        tv.setText(getResources().getString(R.string.content));
        scroll=findViewById(R.id.scroll);
        scroll.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_UP:{
                        break;
                    }
                    case MotionEvent.ACTION_DOWN:{
                        break;
                    }
                    case MotionEvent.ACTION_MOVE:{
                        if(scroll.getScrollY()<=0){
                            Log.i("Main","顶部");
                        }
                        if (scroll.getChildAt(0).getMeasuredHeight()<=scroll.getHeight()+scroll.getScrollY()){
                            Log.i("Main","底部");
                        }
                        break;
                    }
                }
                return false;
            }
        });
    }
}