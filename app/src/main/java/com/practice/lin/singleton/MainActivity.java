package com.practice.lin.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 创建的对象要消耗的资源过多时用到（如访问IO 和数据库等资源）
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
