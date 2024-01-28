package com.example.chapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditFocusActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private EditText et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_focus);
        et_phone = findViewById(R.id.et_phone);
        EditText et_password = findViewById(R.id.et_passworld);
        et_password.setOnFocusChangeListener(this);

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(hasFocus){
            String phone=et_phone.getText().toString();
            if(TextUtils.isEmpty(phone)||phone.length()<11){
                et_phone.requestFocus();
                Toast.makeText(this,"请输入11为手机号码",Toast.LENGTH_SHORT).show();
            }

        }
    }
}