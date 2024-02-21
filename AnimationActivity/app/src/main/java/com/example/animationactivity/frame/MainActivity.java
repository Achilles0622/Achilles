package com.example.animationactivity.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;

import com.example.animationactivity.R;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.view);
        animationDrawable = (AnimationDrawable) view.getBackground();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnStart) {
            animationDrawable.start();
        } else if (view.getId() == R.id.btnStop) {
            animationDrawable.stop();
        }
    }
}

