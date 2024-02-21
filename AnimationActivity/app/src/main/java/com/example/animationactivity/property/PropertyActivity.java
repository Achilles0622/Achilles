package com.example.animationactivity.property;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import com.example.animationactivity.R;

public class PropertyActivity extends AppCompatActivity {
    private ValueAnimator valueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnValueAnimator) {
            valueAnimator =ValueAnimator.ofInt(0,100);
            valueAnimator.setDuration(100);
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationUpdate(ValueAnimator animator){

                }
            });
        }
    }
}