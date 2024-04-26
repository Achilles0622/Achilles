package com.example.fragmentbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class StandardReceiver extends BroadcastReceiver {
    //接受器的标识符为MyReceiver 这个是这个广播的标识符！
    public static final String STANDARD_ACTION = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        //接受广播
        if (intent != null && intent.getAction().equals(STANDARD_ACTION)) {
            Log.d("TAG", "收到了");

        }
    }
}
