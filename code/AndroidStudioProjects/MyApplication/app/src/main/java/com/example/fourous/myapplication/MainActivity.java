package com.example.fourous.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
/*继承AppCompatActivity，向下兼容的activity，activity是Android系统提供的一个活动基类，项目
所有活动必须继承他或者他的子类才能拥有活动的特性，AppCompatActivity是activity的一个子类*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //Oncreate这个方法一个活动创建后必须要执行的方法
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Android程序的设计讲究逻辑和视图分离，不推荐在活动中直接编写界面，更加通用的做法是，在布局文件中
        编写界面，然后在活动中引进来，明显调用了一个R.layout.activity_main布局*/
    }
}
