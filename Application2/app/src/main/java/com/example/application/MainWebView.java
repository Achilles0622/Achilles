package com.example.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.application.R;

public class MainWebView extends AppCompatActivity {

    private String url = "http://www.baidu.com";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_web_view);

        // 解析网址字符串为Uri对象
//        Uri uri = Uri.parse(url);
//
//        // 创建Intent对象，设置Action为ACTION_VIEW，并将Uri对象作为数据
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//
//        // 启动Intent，打开浏览器并加载指定网址
//        startActivity(intent);
        init();
    }
    private void init(){
        webView=findViewById(R.id.webView);
//        webView.loadUrl("file:///android_asset");
        webView.loadUrl("http://www.baidu.com");

    }
}
