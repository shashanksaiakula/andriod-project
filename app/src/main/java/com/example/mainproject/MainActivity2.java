package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("lifecycle","Oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle","start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle","Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle","pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle","Restort");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle","Destory");
    }
}