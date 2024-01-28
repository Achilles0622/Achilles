package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ActionUriActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_uri);
        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_sms).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String phoneNo="12345";
        switch (v.getId()) {
//            case R.id.btn_dial:
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_DIAL);
//                Uri uri =Uri.parse("tel:"+phoneNo);
//                intent.setData(uri);
//                startActivity(intent);
//                break;
        }
    }
}