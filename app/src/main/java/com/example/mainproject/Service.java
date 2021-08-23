package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Service extends AppCompatActivity
{
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        btn1=(Button)findViewById(R.id.button6);
        btn2=(Button)findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.e("start","start");
                srartService(view);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.e("start","stop");
                stopService(view);
            }
        });
    }
    public void srartService(View view)
    {
        Intent i=new Intent(this,MyService.class);
        startService(i);
    }
    public void stopService(View view)
    {
        Intent i=new Intent(this,MyService.class);
        stopService(i);
    }
}