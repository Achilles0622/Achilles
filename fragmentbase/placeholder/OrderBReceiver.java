package com.example.fragmentbase.placeholder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.fragmentbase.StandardReceiver;

public class OrderBReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //接受广播
        if (intent != null && intent.getAction().equals(StandardReceiver.STANDARD_ACTION)) {
            Log.d("TAG", "收到了");

        }
    }
}
