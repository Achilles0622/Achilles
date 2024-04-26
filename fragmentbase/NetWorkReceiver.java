package com.example.fragmentbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Parcelable;
import android.util.Log;

public class NetWorkReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent!=null){
            NetworkInfo networkInfo = intent.getParcelableExtra("networkInfo");
            String text = String.format("收到网络变更广播，" +
                    "网络大类为%s,"+"网络小类为%s，网络制式为%s，网络状态为%s",
                    networkInfo.getTypeName(),
                    networkInfo.getSubtype(),
                    networkInfo.getSubtype(),
                    networkInfo.getState().toString());
            Log.d("TAG", "onReceive: ");




        }
    }
}
