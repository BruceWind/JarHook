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

        Hello.trasportPerson(new Person("bruce"));
    }


    public static void hookWithObjParam(Object obj) {
        if(obj instanceof Person) {
            Log.i("hookXM", "hookWithObjParam,im " + ((Person)obj).name + ".");
        }
    }


    public static void hookWithPerson(Person person) {
        Log.i("hookXM", "hookWithPerson,im " + person.name + ".");
    }

}
