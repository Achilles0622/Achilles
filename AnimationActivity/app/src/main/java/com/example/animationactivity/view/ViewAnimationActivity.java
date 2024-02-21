package com.example.animationactivity.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.animationactivity.R;

public class ViewAnimationActivity extends AppCompatActivity {
    private Animation alphaAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.viewAlphaAnimation) {
            alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
            view.startAnimation(alphaAnimation);
        } else if (view.getId() == R.id.viewScaleAnimation) {
            alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
            view.startAnimation(alphaAnimation);
        } else if (view.getId() == R.id.viewTranslateAnimation) {
            alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.translate);
            view.startAnimation(alphaAnimation);
        } else if (view.getId() == R.id.viewRotateAnimation) {
            alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            view.startAnimation(alphaAnimation);
        }
    }
}