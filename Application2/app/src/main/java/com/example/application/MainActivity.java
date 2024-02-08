package com.example.application;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNormalDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("提示");
        dialog.setMessage("您确定么");
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();
    }

    public void myClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.normal_dialog_btn) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("提示");
            builder.setMessage("您确定么");
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            builder.setNegativeButton("取消", null);
            builder.show();
//            AlertDialog dialog = builder.create();
//            dialog.show();

            // 处理点击正常对话框按钮的逻辑
        } else if (viewId == R.id.diy_dialog_btn) {
            MyDialog md = new MyDialog(this, R.style.mydialog);
            md.show();
            // 处理点击自定义对话框按钮的逻辑
        } else if (viewId == R.id.popup_btn) {
            showPopupWindow(view);
        }
    }

    public void showPopupWindow(View view) {
        //1实例化
        View v = LayoutInflater.from(this).inflate(R.layout.popup_layout, null);

        PopupWindow window = new PopupWindow(v, 500, 100, true);
        //2.设置背景动画
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setOutsideTouchable(true);
        //设置弹窗能相应点击事件
        window.setTouchable(true);
        //3.显示
        window.showAsDropDown(view, -200, 0);
        //为弹窗文本添加点击事件
        v.findViewById(R.id.choose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了选择", Toast.LENGTH_SHORT).show();
            }
        });
        v.findViewById(R.id.choose_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了全选", Toast.LENGTH_SHORT).show();
            }
        });
        v.findViewById(R.id.copy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了复制", Toast.LENGTH_SHORT).show();
            }
        });
    }
}