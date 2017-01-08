package com.example.administrator.sourcetreetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("这是dev分支 第一次提交");
        System.out.println("这是dev分支 1.0");
        System.out.println("这是dev分支 2.0 开发版本");
        System.out.println("这是dev分支 2.0 开发完成");
        System.out.println("这是dev分支 3.0 开发完成");
        System.out.println("这是dev分支 3.0 bugfix");
    }
}
