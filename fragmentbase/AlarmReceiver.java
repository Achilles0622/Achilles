package com.example.fragmentbase;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    public static final String ALARM_ACTION="AlarmAction";
    private final Context mContext;
//把系统闹钟接收器传给mContext
    public AlarmReceiver(Context context){
        super();
        this.mContext=context;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent!=null && intent.getAction().equals(ALARM_ACTION)){
            Log.d("Lag","收到闹钟广播");

        }
    }
    public void  sendAlarm(){
        Intent intent = new Intent("AlarmAction");
        //PendingIntent是一个延迟意图 getBroadcast使用时候的四个参数
        //1。context：上下文对象，通常是指当前的活动或服务的上下文。
        //2。requestCode：请求码，用于标识这个 PendingIntent 对象，通常用于识别不同的请求。请求码需要是一个正整数。
        //3。intent：要启动的活动的意图（Intent）。这个意图描述了要执行的操作，比如启动哪个活动、传递哪些数据等。
        //4。PendingIntent.FLAG_IMMUTABLE：标志位，用于描述 PendingIntent 对象的特性。在这个例子中，使用了 PendingIntent.FLAG_IMMUTABLE 标志位，表示创建的 PendingIntent 对象是不可变的，不能在后续代码中修改。

        PendingIntent pendingIntent=PendingIntent.getBroadcast(mContext,0,intent,PendingIntent.FLAG_IMMUTABLE);
        //从系统的类里拿到闹钟管理管理器然后赋给参数alarmManager
        AlarmManager alarmManager =(AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
        //set传的三个传输分别是1系统广播参数意思定期播发，2触发时间设置 3执行意图逻辑，是上面设计的
        //6.0之后屏幕暗屏时候是不发送广播的
        alarmManager.set(AlarmManager.RTC_WAKEUP,1000,pendingIntent);
    }
}
