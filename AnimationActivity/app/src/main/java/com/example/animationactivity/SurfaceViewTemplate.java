package com.example.animationactivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.NonNull;

public class SurfaceViewTemplate extends SurfaceView implements Runnable {
    private Thread mThread;
    private volatile boolean isRunning;
    private Paint mPaint;
    private int mMinRadius;
    private int mMaxRadius;
    private int mRadius;
    private int mFlag;

    public SurfaceViewTemplate(Context context, AttributeSet attrs) {
        super(context, attrs);
        SurfaceHolder holder = getHolder();
        holder.addCallback(new SurfaceHolder.Callback() {
            public void operate(View v){

            }
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                isRunning=true;
                mThread = new Thread(SurfaceViewTemplate.this);
                mThread.start();

            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
                isRunning = false;
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
        setKeepScreenOn(true);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setDither(true);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(6);
        mPaint.setColor(Color.GREEN);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        mMaxRadius = Math.min(w, h) / 2 - 20;
        mRadius = mMinRadius = 30;

    }

    @Override
    public void run() {
        while (isRunning) {
            drawSelf();
        }

    }

    private void drawSelf() {
        Canvas canvas = null;
        try {
            canvas = getHolder().lockCanvas();
            if (canvas != null) {
                drawCircle(canvas);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (canvas != null) {
                getHolder().unlockCanvasAndPost(canvas);
            }
        }


    }

    private void drawCircle(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, mRadius, mPaint);
        if (mRadius >= mMaxRadius) {
            mFlag = -1;
        } else if (mRadius <= mMinRadius) {
            mFlag = 1;

        }
        mRadius += mFlag * 2;
    }
}
