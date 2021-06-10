package com.snovia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC3","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC3","onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC3","onPause called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC3","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC3","onDestroy called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ALC3","onCreate called");
    }


}