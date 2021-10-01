package com.example.helloraniakorbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Throwable throwable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Log.e("MainActivity", "Il s'agit d'une exception java",throwable.getCause());
        Log.e("MainActivity", "Il s'agit d'une exception java",throwable.fillInStackTrace());*/
    }
}