package com.example.appexit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppManager.getAppManager().addActivity(this);

    }
    /*
    *使用AppManager工具类
     Activity启动时，在的onCreate方法里面，将该Activity实例添加到AppManager的堆栈
     AppManager.getAppManager().addActivity(this);
     需要退出程序时，调用
     AppManager.getAppManager().AppExit(this);
    *
    *
    *
    * */
}
