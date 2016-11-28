package com.mricefox.gradledynamicdependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.badoo.mobile.util.WeakHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new WeakHandler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("WeakHandler", "done");
            }
        }, 10000);
    }
}
