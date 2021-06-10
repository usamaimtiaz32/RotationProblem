package com.snovia.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    Button button;
    int count=0;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        Log.d("ALC","onCreate called");
        if(savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("value");
            textview.setText(String.valueOf(count));
        }
    }

    public void increaseNumber(View view) {
           count=Integer.parseInt(textview.getText().toString());
           count++;
           textview.setText(String.valueOf(count));
    }

    public void moveToActivity2(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void moveToActivity3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}