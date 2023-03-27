package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        tv= findViewById(R.id.textView);
        Intent i = getIntent();
        String str = i.getStringExtra("personname");
        tv.setText("Hello, " + str +"!");




    }
}