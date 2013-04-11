package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;

import android.widget.TextView;

public class HelloWorldMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world_main);
        TextView text = new TextView(this);
        text.setText("Hello World, Android - symtkn");
        setContentView(text);
    }

   
}
