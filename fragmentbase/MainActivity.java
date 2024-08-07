package com.example.fragmentbase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fragmentbase.placeholder.IFragmentCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(this);
        Button button2=findViewById(R.id.btn2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn) {
            Bundle bundle=new Bundle();
            bundle.putString("message","アンドロイドが好きです");
            BlankFragment1 bf = new BlankFragment1(); 
            bf.setArguments(bundle);
            bf.setFragmentCallback(new IFragmentCallback() {
                @Override
                public void sendMsgToActivity(String msg) {
                    Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
                }

                @Override
                public String getMsgFromActivity(String msg) {
                    return "初めまして、activityから来ました ";
                }
            });
            replaceFragment(bf);

        }if(view.getId() == R.id.btn2) {
            replaceFragment(new ItemFragment());
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
//        transaction.addToBackStack(null);
        transaction.commit();
    }
}