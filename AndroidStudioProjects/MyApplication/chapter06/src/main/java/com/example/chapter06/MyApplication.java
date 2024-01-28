package com.example.chapter06;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.HashMap;

public class MyApplication extends Application {
    private static MyApplication mApp;
    public HashMap<String,String >infoMap=new HashMap<>();
    public static MyApplication getInstance(){
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp=this;
        Log.d("ning","onCreate");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d("ning","onTerminate");

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("ning","onConfigurationChanged");


    }
}
