package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BroadCast extends AppCompatActivity
{
   Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);

        btn=(Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadCast(view);
            }
        });
    }
    public void broadCast(View view)
    {
        Intent i= new Intent();
        i.setAction("com.example.CUSTOM_INTENT");
        sendBroadcast(i);
    }
}