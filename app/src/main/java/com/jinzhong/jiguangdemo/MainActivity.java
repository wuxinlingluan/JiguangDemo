package com.jinzhong.jiguangdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.setAlias(this,1001,"10086");
    }
}
