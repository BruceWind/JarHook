package com.androidyuan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.androidyuan.Hello;

import com.androidyuan.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello.sayHello("weizongwei5");
    }


    public static void hookXM(String name) {
        Log.i("hookXM", "hello av8d,im "+name+".");
    }

}
